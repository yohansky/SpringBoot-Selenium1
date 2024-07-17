package com.spring.spring_selenium;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringSeleniumApplicationTests {

//	annotasi Autowired untuk meminta spring membuat object untuk saya
	@Autowired
//	mengambil method dari user java
	private User user;

	@Test
	void contextLoads() {
	user.printDetails();
	}
//	var address = new Address();
//	var salary = new Salary();
//	var user = new User(address, salary);
////		User user = new User();
//		user.printDetails();
}
