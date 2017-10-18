package com.gengsc.prototype.shadown;

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
		WorkExperience experience = new WorkExperience();
		experience.setTimeArea("1998-2000");
		experience.setCompany("xx公司");
		resume.setExperience(experience);
		
		Resume resume2 = (Resume) resume.clone();
		WorkExperience experience2 = resume2.getExperience();
		experience2.setTimeArea("1998-2003");
		experience2.setCompany("YY公司");
		
		Resume resume3 = (Resume) resume.clone();
		WorkExperience experience3 = resume2.getExperience();
		experience3.setTimeArea("1998-2006");
		experience3.setCompany("ZZ公司");
		
		resume2.dispaly();
		resume.dispaly();
		resume3.dispaly();
	}
}
