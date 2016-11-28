package kr.kina.web;

import java.util.List;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import kr.kina.domain.BoardVO;
import kr.kina.domain.Criteria;
import kr.kina.domain.SearchCriteria;
import kr.kina.persistence.BoardDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
		locations={"file:src/main/webapp/WEB-INF/spring/**/*.xml"})

public class BoardDAOTest {
	
	private Logger logger = LoggerFactory.getLogger(BoardDAOTest.class);
	
	@Inject
	private BoardDAO dao;

//	@Test
//	public void testInsert()throws Exception{
//		dao.insertBoard(new BoardVO()
//					.setTitle("title01")
//					.setContent("blarblar...")
//					.setWriter("Writer"));
//		logger.info("Insert Data into tbl_board");
//	}
//	
//	@Test
//	public void testReadOne() throws Exception {
//		logger.info("----------------------------------- selectOne");
//		logger.info(dao.selectOneBoard(2).toString());
//	}
//	
//	@Test
//	public void testUpdate()throws Exception {
//		BoardVO vo = new BoardVO();
//		vo.setTitle("title!!!!!!!");
//		vo.setContent("Contnntntn");
//		vo.setWriter("dkdkdkdk");
//		dao.updateBoard(vo);
//	}
//	
//	@Test
//	public void testDelete() throws Exception {
//		dao.deleteBoard(1);
//	}	
	
/*	@Test
	public void testListPage() throws Exception {
		Criteria cri = new Criteria();
		cri.setPage(2);
		cri.setPerPageNum(10);
		List<BoardVO> list = dao.listCriteria(cri);
		
		for (BoardVO vo : list){
			logger.info(vo.getBno() + ":" + vo.getTitle());
		}
	}
*/
	@Test
	public void testURI()throws Exception {
		UriComponents uriComponent = 
				UriComponentsBuilder.newInstance()
				.path("/board/read")
				.queryParam("bno", 12)
				.queryParam("perPageNum", 20)
				.build();
		logger.info("---------------------------------------------");
		logger.info("/board/read?bno=12&perPageNum=20");
		logger.info(uriComponent.toString());
	}
	
	@Test
	public void testURI2() throws Exception {
		UriComponents uriComponents=
				UriComponentsBuilder.newInstance()
				.path("/{module}/{page}")
				.queryParam("bno", 12)
				.queryParam("perPageNum", 20)
				.build()
				.expand("board","read")
				.encode();
		logger.info("/board/read?bno=12&perPageNum=20");
		logger.info(uriComponents.toString());
	}
	
	@Test
	public void testDynamic1() throws Exception {
		SearchCriteria cri = new SearchCriteria();
		cri.setPage(1);
		cri.setKeyword("title");
		cri.setSearchType("t");
		
		logger.info("---------------------------------------------");
		
		List<BoardVO> list = dao.listSearch(cri);
		
		for(BoardVO boardVO : list){
			logger.info(boardVO.getBno() + ":" + boardVO.getTitle());
		}
		
		logger.info("---------------------------------------------");
		
		logger.info("COUNT : " + dao.listSearchCount(cri));
	}
	
	

}

