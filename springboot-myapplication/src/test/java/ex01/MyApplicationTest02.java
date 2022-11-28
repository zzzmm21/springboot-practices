package ex01;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
/*
 * Spring Boot Test Integuration 기반
 * 
 * Error:
 * Spring Boot Test Integuration (@SpringBootTest) 에서는 
 * @Configuration을 달고 있는 설정 클래스는 자동(스캔) 하지 못한다.
 */
@SpringBootTest
public class MyApplicationTest02 {
	@Autowired
	private MyComponent myComponent;
	
	@Test
	public void myComponentNotNull() {
		assertNotNull(myComponent);
	}
}
