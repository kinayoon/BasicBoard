package kr.kina.domain;

import java.util.Date;

public class BoardVO {  

	private int bno;
	private String title;
	private String content;
	private String writer;
	private Date regdate;
	private int viewcnt;
	
	
	public int getBno() {
		return bno;
	}
	public BoardVO setBno(int bno) {
		this.bno = bno;
		return this;
	}
	public String getTitle() {
		return title;
	}
	public BoardVO setTitle(String title) {
		this.title = title;
		return this;
	}
	public String getContent() {
		return content;
	}
	public BoardVO setContent(String content) {
		this.content = content;
		return this;
	}
	public String getWriter() {
		return writer;
	}
	public BoardVO setWriter(String writer) {
		this.writer = writer;
		return this;
	}
	public Date getRegdate() {
		return regdate;
	}
	public BoardVO setRegdate(Date regdate) {
		this.regdate = regdate;
		return this;
	}
	public int getViewcnt() {
		return viewcnt;
	}
	public BoardVO setViewcnt(int viewcnt) {
		this.viewcnt = viewcnt;
		return this;
	}
	
	
}
