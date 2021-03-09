package com.event.demo;

import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.event.controller.HomeController;

//@SpringBootTest
@RunWith(SpringRunner.class)
//@WebMvcTest(HomeController.class)
public class EventSystemApplicationTests {

	@Autowired
	private MockMvc mockMvc;	
	
	@Test
	public void testHome() throws Exception {
		
		mockMvc.perform(get("/"))
		.andExpect(status().isOk())
		.andExpect(view().name("event"));
		
	}

}
