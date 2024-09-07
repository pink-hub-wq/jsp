package com.edu.seiryo.util;

import java.util.List;

public class PageHelper {

	private int row=5;//ÿҳ����

	private int total;//����������ѯ��

	private int currentPage;//��ǰ�ڼ�ҳ

	private int totalPage;//��ҳ��(����)

	private List list;//��ѯ�����ݣ���ѯ��

	/**
	 * @param row
	 * @param total
	 * @param currentPage
	 * @param totalPage
	 * @param list
	 */
	public PageHelper(int row, int total, int currentPage, List list) {
		super();
		this.row = row;
		this.total = total;
		this.currentPage = currentPage;
	
		if (total % row == 0) {
			this.totalPage = total / row;
		} else {
			this.totalPage = total / row + 1;
		}
		this.list = list;
	}

	/**
	 * 
	 */
	public PageHelper() {
		super();
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public List getList() {
		return list;
	}

	public void setList(List list) {
		this.list = list;
	}

}
