package kr.kina.persistence;

import java.util.List;

import kr.kina.domain.BoardVO;
import kr.kina.domain.Criteria;
import kr.kina.domain.SearchCriteria;

public interface BoardDAO {

	public void insertBoard(BoardVO vo)throws Exception;     //게시판 글 등록
	public BoardVO selectOneBoard(Integer bno)throws Exception;  //게시판 세부 글 조회
	public List<BoardVO> selectAllBoard()throws Exception;  						 //게시판 목록 조회
	public void updateBoard(BoardVO vo)throws Exception;  //게시판 글 업데이트
	public void deleteBoard(Integer bno)throws Exception;     //게시판 글 삭제
	public List<BoardVO> listCriteria(Criteria cri) throws Exception; //게시판 목록
	public int countPaging(Criteria cri)throws Exception;  //게시판 페이징 처리 
	public List<BoardVO> listSearch(SearchCriteria cri)throws Exception; //동적 SQL문 처리를 위한 메소드 
	public int listSearchCount(SearchCriteria cri)throws Exception;  //동적SQL문 처리를 위한 메소드 
	
}
