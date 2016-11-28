package kr.kina.persistence;


import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import kr.kina.domain.BoardVO;
import kr.kina.domain.Criteria;
import kr.kina.domain.SearchCriteria;

@Repository
public class BoardDAOImpl implements BoardDAO{

	@Inject
	private SqlSession sqlSession; 
	
	private String namespace="kr.kina.mappers.BoardMapper";
	
	@Override
	public void insertBoard(BoardVO vo) throws Exception {
		sqlSession.insert(namespace+".insertBoard", vo);
	}

	@Override
	public BoardVO selectOneBoard(Integer bno) throws Exception {
		return sqlSession.selectOne(namespace+".selectOneBoard", bno);
	}

	@Override
	public List<BoardVO> selectAllBoard() throws Exception {
		return sqlSession.selectList(namespace+".selectAllBoard");
	}

	@Override
	public void updateBoard(BoardVO vo) throws Exception {
		sqlSession.update(namespace+".updateBoard", vo);
	}

	@Override
	public void deleteBoard(Integer bno) throws Exception {
		sqlSession.delete(namespace+".deleteBoard",bno);
	}

	@Override
	public List<BoardVO> listCriteria(Criteria cri) throws Exception {
		return sqlSession.selectList(namespace+".listCriteria", cri);
	}

	@Override
	public int countPaging(Criteria cri) throws Exception {
		return sqlSession.selectOne(namespace + ".countPaging",cri);
	}

	@Override
	public int listSearchCount(SearchCriteria cri) throws Exception {
		return sqlSession.selectOne(namespace + ".listSearchCount", cri);
	}

	@Override
	public List<BoardVO> listSearch(SearchCriteria cri) throws Exception {
		return sqlSession.selectList(namespace + ".listSearch", cri);
	}
}
