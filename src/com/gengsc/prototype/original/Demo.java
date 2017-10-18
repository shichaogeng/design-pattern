package com.gengsc.prototype.original;

/**
 * @author shichaogeng
 *
 * 2017年10月16日
 */
public class Demo {

	public static void main(String[] args) throws Exception {
		Resume resume = new Resume();
		resume.setName("大鸟");
		resume.setGender("男");
		resume.setAge(29);
		resume.setTimeArea("1998-2000");
		resume.setCompany("xx公司");
		resume.dispaly();
		
		Resume resume2 = (Resume) resume.clone();
		resume2.setTimeArea("1998-2006");
		resume2.dispaly();
		
		Resume resume3 = (Resume) resume.clone();
		resume3.setAge(24);
		resume3.dispaly();
	}
}
