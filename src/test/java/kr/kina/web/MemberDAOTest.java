package kr.kina.web;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.kina.domain.MemberVO;
import kr.kina.persistence.MemberDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
		locations={"file:src/main/webapp/WEB-INF/spring/**/*.xml"})

public class MemberDAOTest {

	@Inject
	private MemberDAO dao;
	
	@Test
	public void getTime()throws Exception{
		System.out.println("TIME -------->  "+ dao.getTime());
	}
	
	@Test
	public void getInsertMember()throws Exception{
		dao.insertMember(
				new MemberVO().setUserID("spring2")
							  .setUserPW("12342")
							  .setUserName("kin2a")
							  .setEmail("s13@test.com"));
		
	}
}
