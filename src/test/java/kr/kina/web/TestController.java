package kr.kina.web;

import javax.inject.Inject;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
//@WebAppConfiguration
@ContextConfiguration(
		locations={"file:src/main/webapp/WEB-INF/spring/**/*.xml"})

public class TestController {
	
	private static final Logger logger = LoggerFactory.getLogger(TestController.class);
	
//	@Inject
//		private WebApplicationContext wac;
//		private MockMvc mockMvc;
//		
//	@Before
//	public void setup(){
//		this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
//		logger.info("setup ...........");
//	}
}
