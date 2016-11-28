package kr.kina.domain;

import java.util.Date;

public class MemberVO {

	private String userID;
	private String userPW;
	private String userName;
	private String email;
	private Date regDate;
	private Date updateDate;
	
	
	
	public String getUserID() {
		return userID;
	}
	public MemberVO setUserID(String userId) {
		this.userID = userId;
		return this;
	}
	public String getUserPW() {
		return userPW;
	}
	public MemberVO setUserPW(String userPw) {
		this.userPW = userPw;
		return this;
	}
	public String getUserName() {
		return userName;
	}
	public MemberVO setUserName(String userName) {
		this.userName = userName;
		return this;
	}
	public String getEmail() {
		return email;
	}
	public MemberVO setEmail(String email) {
		this.email = email;
		return this;
	}
	public Date getRegDate() {
		return regDate;
	}
	public MemberVO setRegDate(Date regDate) {
		this.regDate = regDate;
		return this;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public MemberVO setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
		return this;
	}
}
