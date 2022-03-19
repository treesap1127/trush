package kr.ac.kopo.util;

import java.util.ArrayList;
import java.util.List;

public class Pager {
	private int page = 1; //페이지 수
	private int perPage = 10; //페이지에 나오는 목록 수
	private int perGroup=5; //jsp page 5단위로 끊어줌
	private float total;//토탈값은 특수하게 합계로 계산하는 값!
	private int search=0; // 찾는 값
	private String keyword; //특수하게 받아주는 값

	public int getSearch() {
		return search;
	}
	public void setSearch(int search) {
		this.search = search;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public int getPrev() {//이전 페이지로 넘김
		return page<=perGroup ? 1:(((page-1)/perGroup)-1)*perGroup+1;
	}
	public int getNext() {//다음 페이지로 넘김
		
		int next =(((page-1)/perGroup)+1)*perGroup+1;
		int last = getLast();
		return next<last?next:last;
	}
	
	public List<Integer> getList(){
		ArrayList<Integer> list=new ArrayList<Integer>(); //list 에 해당 객체 만들어서 integer받아오려고함 숫자 리스트..?
		int startPage=((page-1)/perGroup)*perGroup+1;//시작 페이지 구하기  1,6,11 구하는거 ㅇㅇ
		for (int index=startPage;index<(startPage+perGroup)&& index<=getLast();index++)
//시작페이지=index 시작페이지가 시작+5보다작고=페이지5개만들기 첫페이지가 last이하면=마지막 페이지까지 ㅇㅇ 굴러감 시작페이지+1 해주면서 굴러감  
			list.add(index);
								
		if(list.isEmpty())
			list.add(1);
		return list;
	}
	
	
	public int getLast() {//마지막 페이지
		int last = (int) Math.ceil(total/perPage);
		return last<1?1:last;
	}
	
	public int getPerGroup() {
		return perGroup;
	}
	public void setPerGroup(int perGroup) {
		this.perGroup = perGroup;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
	public int getOffset() {
		return (page-1)*perPage; //3페이지때 2*10 20번 해줌~ 10 0~9 10~19
								// 페이지의 목록 갯수를 실현시켜주는 것
	}
	public int getPage() {
		return page;
	}
	public int getPerPage() {
		return perPage;
	}
	public void setPerPage(int perPage) {
		this.perPage = perPage;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getPerpage() {
		return perPage;
	}
	public void setPerpage(int perpage) {
		this.perPage = perpage;
	}
	public String getQuery() {//getQuery는 주소값을 받아줌
		if(search<1)
			return null;
		return "&search="+search+"&keyword="+keyword;
	}
	
}
