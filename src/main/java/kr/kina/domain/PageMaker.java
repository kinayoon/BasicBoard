package kr.kina.domain;

import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

public class PageMaker {

	private int totalCount;
	private int startPage;
	private int endPage;
	private boolean prev;
	private boolean next;
	private int displayPageNum = 10;
	
	private Criteria cri;
	
	public void setCri(Criteria cri){
		this.cri = cri;
	}
	
	public Criteria getCri(){
		return this.cri;
	}
	
	public void setStartPage(int page) {
		this.startPage = page;
	}
	
	public void setEndPage(int page) {
		this.endPage = page;
	}
	
	public void setDisplayPageNum(int num){
		this.displayPageNum = num;
	}
	
	public int getStartPage(){
		return this.startPage;
	}
	public int getEndPage(){
		return this.endPage;
	}
	public int totalCount(){
		return this.totalCount;
	}

	public boolean isPrev() {
		return prev;
	}

	public void setPrev(boolean prev) {
		this.prev = prev;
	}

	public boolean isNext() {
		return next;
	}

	public void setNext(boolean next) {
		this.next = next;
	}
	
	public void setTotalCount(int totalCount){
		this.totalCount = totalCount;
		calcData();
	}
	
	public void calcData(){
		endPage = (int) (Math.ceil(cri.getPage()/ (double) displayPageNum) * displayPageNum);
		startPage = (endPage - displayPageNum) + 1;
		int tempEndPage = (int) (Math.ceil(totalCount / (double) cri.getPerPageNum()));
		
		if(endPage > tempEndPage) {
			endPage = tempEndPage;
		}
		prev = startPage == 1 ? false : true;
		
		next = endPage * cri.getPerPageNum() >= totalCount ? false : true;
	}
	
	public String makeQuery(int page){
		UriComponents uriComponents =
				UriComponentsBuilder.newInstance()
					.queryParam("page", page)
					.queryParam("perPageNum", cri.getPerPageNum()).build();
		return uriComponents.toUriString();
	}
	
	public String makeSearch(int page){
		
		UriComponents uriComponents = 
				UriComponentsBuilder.newInstance()
					.queryParam("page", page)
					.queryParam("perPageNum", cri.getPerPageNum())
					.queryParam("searchType", ((SearchCriteria)cri).getSearchType())
					.queryParam("keyword", ((SearchCriteria)cri).getKeyword())
					.build();		
		return uriComponents.toString();
	}
	
	@Override
	public String toString() {
		return "[totalCount= "+ totalCount + ", startPage= " + startPage+ ", endPage= " +endPage+ "]"; 
	}
}
