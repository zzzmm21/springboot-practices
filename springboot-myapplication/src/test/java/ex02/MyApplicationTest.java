package ex02;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
/*
 * Spring Boot Test Integuration 기반
 * 
 * Spring Boot Test Integuration(@SpringBootTest) 에서는 
 * 자동(스캔)을 위해서 설정 클래스에 @SpringBootConfiguration을 달아야 한다.
 */
@SpringBootTest
public class MyApplicationTest {
	@Autowired
	private MyComponent myComponent;
	
	@Test
	public void myComponentNotNull() {
		assertNotNull(myComponent);
	}
}
