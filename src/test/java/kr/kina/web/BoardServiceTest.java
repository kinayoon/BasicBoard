package kr.kina.web;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.kina.domain.BoardVO;
import kr.kina.persistence.BoardDAO;
import kr.kina.service.BoardService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class BoardServiceTest {

	@Inject
	private BoardService service;
	
	@Test
	public void testInsert() throws Exception{
		service.regist(new BoardVO()
				.setTitle("This is a Service")
				.setContent("ngngngn")
				.setWriter("djhdhdh"));
	}

}
