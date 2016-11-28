package kr.kina.persistence;

import kr.kina.domain.MemberVO;

public interface MemberDAO {
	
	public String getTime();  //현재 시간 구하기
	public void insertMember(MemberVO memberVo); //신규멤버 등록	
	public MemberVO readMember(String userId) throws Exception;//멤버리스트 읽어들이기 
	public MemberVO readWithPW(String userId, String userPW) throws Exception;//비밀번호,아이디 모두 읽어들이기 
	
}
