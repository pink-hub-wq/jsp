package org.YaoLeGouDB.utils;

public class pageBean {

	/**
	 * 当前坐标
	 */
	private int pageNo = 1;
	
	/**
	 * 每页显示的行数
	 */
	private int pageSize = 15;
	
	/**
	 * 总共的行
	 */
	private int totalCount;
	
	/**
	 * 总共的页数
	 */
	private int totalPage;
	
	/**
	 * 上一页
	 */
	private int prvePage;
	
	/**
	 * 下一页
	 */
	private int nextPage;

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public int getTotalPage() {
		int totalPage = (this.totalCount - 1) / this.pageSize + 1;
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public int getPrvePage() {
		/*int prvePage = this.pageNo > this.totalPage?this.totalPage:this.pageNo + 1;*/
		int prvePage = this.pageNo==1?1:this.pageNo - 1;
		return prvePage;
	}

	public void setPrvePage(int prvePage) {
		this.prvePage = prvePage;
	}

	public int getNextPage() {
		/*int nextPage = this.pageNo >= 1?1:this.pageNo-1;*/
		this.nextPage = this.pageNo>=this.getTotalPage()?this.getTotalPage():this.pageNo+1;
		return nextPage;
	}

	public void setNextPage(int nextPage) {
		this.nextPage = nextPage;
	}
	
	
}
