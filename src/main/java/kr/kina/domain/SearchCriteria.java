package kr.kina.domain;
//검색에 필요한 데이터를 위해 만든 클래스 
public class SearchCriteria extends Criteria{

	private String searchType;
	private String keyword;
	
	public String getSearchType() {
		return searchType;
	}
	public void setSearchType(String searchType) {
		this.searchType = searchType;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	
	@Override
	public String toString(){
		return super.toString() + " SearchCriteria " + 
	    "[SearchType=" + searchType + ", keyword=" + keyword + "]";
	}
}
