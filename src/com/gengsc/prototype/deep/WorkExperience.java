package com.gengsc.prototype.deep;

/**
 * @author shichaogeng
 *
 *         2017年10月16日
 */
public class WorkExperience implements Cloneable{

	private String timeArea;

	private String company;

	/**
	 * @return the timeArea
	 */
	public String getTimeArea() {
		return timeArea;
	}

	/**
	 * @param timeArea
	 *            the timeArea to set
	 */
	public void setTimeArea(String timeArea) {
		this.timeArea = timeArea;
	}

	/**
	 * @return the company
	 */
	public String getCompany() {
		return company;
	}

	/**
	 * @param company
	 *            the company to set
	 */
	public void setCompany(String company) {
		this.company = company;
	}
	
	/**
	 * @author shichaogeng
	 * @date 2017年10月16日
	 * @return
	 * @throws CloneNotSupportedException
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
