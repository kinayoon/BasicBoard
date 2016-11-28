package kr.kina.persistence;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import kr.kina.domain.MemberVO;

@Repository
public class MemberDAOImpl implements MemberDAO{

	//selSession의존객체 주입받기
	@Inject
	private SqlSession sqlSession;
	
	private static final String namespace = "kr.kina.mappers.MemberMapper";
	
	@Override
	public String getTime() {
		return sqlSession.selectOne(namespace+".getTime");
	}

	@Override
	public void insertMember(MemberVO memberVo) {
		sqlSession.insert(namespace+".insertMember", memberVo);
	}
	
	@Override
	public MemberVO readMember(String userId) throws Exception{
		return sqlSession.selectOne(namespace+".readMember", userId);
	}
	
	@Override
	public MemberVO readWithPW(String userId, String userPW) throws Exception {
		Map<String,Object> paramMap = new HashMap<String, Object>();
		paramMap.put("userid", userId);
		paramMap.put("userpw", userPW);
		
		return sqlSession.selectOne(namespace+".readWithPW", paramMap);
	}

}
