package com.spring.spring_selenium;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringSeleniumApplicationTests {

	@Test
	void contextLoads() {
		var address = new Address();
		var salary = new Salary();
		var user = new User(address, salary);
//		User user = new User();
		user.printDetails();
	}

}
