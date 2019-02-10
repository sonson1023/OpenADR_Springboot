/**
 * 
 */
package com.oadr2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import com.oadr2.b.controller.OadrRestController;

import ch.qos.logback.core.status.Status;

/**
 * @author seongwan
 *
 */

@RunWith(MockitoJUnitRunner.class)
public class OadrRestControllerTest {
	
	@InjectMocks
	private OadrRestController controller;
	private MockMvc mockMvc;
	
	@Before
	public void setup() {
		mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
	}
	
	@Test
	public void getOadr() throws Exception {
		mockMvc.perform(get("/oadr")).andExpect(status().isOk());
	}
	
//	@Test
//	public void test() {
//		fail("Not yet implemented");
//	}

}
