package com.jee_project.chatbot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.jee_project.chatbot.models.UserDto;
import com.jee_project.chatbot.services.UserService;

@SpringBootTest
class ChatbotApplicationTests {

	@Autowired
	private UserService userService;
	@Test
	void contextLoads() {
		
		UserDto newUser = new UserDto();
		newUser.setFirstName("Test");
		newUser.setLastName("User");
		newUser.setEmail("testuser@example.com");
		newUser.setPassword("password");

		userService.saveUser(newUser);
	}
	

}
