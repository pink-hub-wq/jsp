package com.edu.seiryo.util;

import java.util.*;
/**
 * ��ҳBean
 * @author Cc.liu
 *
 */
public class Pager {

	/** ��ǰҳ���� */
	private int currentPage = 1;

	/** ÿҳ��ʾ��¼����, Ĭ��Ϊ 2 */
	private int sizePerPage = 9;

	/** ��ҳ�� */
	private int totalPage;

	/** ��Ҫ��ҳ�ĳ��ַ��� */
	@SuppressWarnings("unchecked")
	private List topicSelect;

	public Pager() {
		this.topicSelect = new ArrayList();
	}

	/**
	 * ���ص�ǰҳ���ı�
	 * 
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List getCurrentPagedText() {
		try {
			if (getCurrentPage() < getTotalPage()) {
				return getTopicSelect().subList(
						(getCurrentPage() - 1) * getSizePerPage(),getCurrentPage() * getSizePerPage());
			} else if (getTotalPage() > 0) {
				return getTopicSelect().subList((getCurrentPage() - 1) * getSizePerPage(),getTopicSelect().size());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * @return Returns the ��ǰҳ����.
	 */
	public int getCurrentPage() {
		if (currentPage <= 0)
			currentPage = 1;
		return currentPage;
	}

	/**
	 * ���õ�ǰҳ��, �� 1 ��ʼ.
	 * 
	 * @param currentPage
	 *            The ��ǰҳ���� to set.
	 */
	public void setCurrentPage(int currentPage) {
	    if (currentPage <= 0) {
	        this.currentPage = 1;
	    } else if (currentPage > getTotalPage()) {
	        this.currentPage = getTotalPage(); 
	    } else {
	        this.currentPage = currentPage;
	    }
	}

	/**
	 * @return Returns the ��ҳ����, ���û������, �ͷ��� 1.
	 */
//	���ü���.size��ȡ���ϵ���������ÿҳ��ʾ�������õ�ҳ��
	public int getTotalPage() {
		if (getTopicSelect() == null)
			totalPage = 0;
		totalPage = (int) Math.ceil(1.0 * getTopicSelect().size()
				/ getSizePerPage()); // ��ҳ����

		if (totalPage == 0)
			totalPage = 1;
		return totalPage;
	}

	/**
	 * @param totalPage
	 *            The totalPage to set.
	 */
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	/**
	 * @return Returns the ÿҳ��ʾ����.
	 */
	public int getSizePerPage() {
		return sizePerPage;
	}

	/**
	 * @param sizePerPage
	 *            The ÿҳ��ʾ����to set.
	 */
	public void setSizePerPage(int sizePerPage) {
		this.sizePerPage = sizePerPage;
	}

	/**
	 * @return Returns the ��Ҫ��ҳ���ı�.
	 */
	@SuppressWarnings("unchecked")
	public List getTopicSelect() {
		return topicSelect;
	}

	@SuppressWarnings("unchecked")
	public void setTopicSelect(List topicSelect) {
		this.topicSelect = topicSelect;
	}
}
