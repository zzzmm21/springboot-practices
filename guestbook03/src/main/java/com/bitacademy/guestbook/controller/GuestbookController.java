package com.bitacademy.guestbook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.bitacademy.guestbook.repository.GuestbookRepository;
import com.bitacademy.guestbook.vo.GuestbookVo;


@Controller
public class GuestbookController {
	@Autowired
	private GuestbookRepository guestbookrepository;
	
	@RequestMapping("")
	public String index(Model model) {
		List<GuestbookVo> list = guestbookrepository.findAll();
		
		model.addAttribute("list",list);
		return "/WEB-INF/views/index.jsp";
	}
	@RequestMapping(value="/deleteform{no}", method=RequestMethod.GET)
	public String deleteform() {
	
		return"/WEB-INF/views/deleteform.jsp";
		
	}
	@RequestMapping(value="/delete", method=RequestMethod.POST)
	public String delete(GuestbookVo vo) {	
		guestbookrepository.delete(vo);
		return"redirect:/";
	}


	@RequestMapping(value="/add", method=RequestMethod.POST)
	public String add(GuestbookVo vo) {
		guestbookrepository.insert(vo);
		return"redirect:/";
	}



}
