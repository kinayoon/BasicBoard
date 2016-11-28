package kr.kina.service;

import java.util.List;

import kr.kina.domain.BoardVO;
import kr.kina.domain.Criteria;
import kr.kina.domain.SearchCriteria;

public interface BoardService {
	public void regist(BoardVO vo)throws Exception;
	public BoardVO read(Integer bno)throws Exception;
	public void modify(BoardVO board)throws Exception;
	public void remove(Integer bno)throws Exception;
	public List<BoardVO> listAll() throws Exception;
	public List<BoardVO> listCriteria(Criteria cri) throws Exception;
	public int listCountCriteria(Criteria cri)throws Exception;
	public List<BoardVO> listSearchCriteria(SearchCriteria cri)throws Exception;
	public int listSearchCount(SearchCriteria cri)throws Exception;
}
