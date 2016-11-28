package kr.kina.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import kr.kina.domain.BoardVO;
import kr.kina.domain.Criteria;
import kr.kina.domain.SearchCriteria;
import kr.kina.persistence.BoardDAO;

@Service
public class BoardServiceImpl implements BoardService{

	@Inject   //Java วฅมุ Annotation
	private BoardDAO dao;
	
	@Override
	public void regist(BoardVO vo) throws Exception {
		dao.insertBoard(vo);		
	}

	@Override
	public BoardVO read(Integer bno) throws Exception {
		return dao.selectOneBoard(bno);
	}

	@Override
	public void modify(BoardVO vo) throws Exception {
		dao.updateBoard(vo);	
	}

	@Override
	public void remove(Integer bno) throws Exception {
		dao.deleteBoard(bno);
	}

	@Override
	public List<BoardVO> listAll() throws Exception {
		return dao.selectAllBoard();
	}

	@Override
	public List<BoardVO> listCriteria(Criteria cri) throws Exception {
		return dao.listCriteria(cri);
	}

	@Override
	public int listCountCriteria(Criteria cri) throws Exception {
		return dao.countPaging(cri);
	}

	@Override
	public List<BoardVO> listSearchCriteria(SearchCriteria cri) throws Exception {
		return dao.listSearch(cri);
	}

	@Override
	public int listSearchCount(SearchCriteria cri) throws Exception {
		return dao.listSearchCount(cri);
	}

}
