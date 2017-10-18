package com.gengsc.prototype.shadown;

/**
 * @author shichaogeng
 *
 * 2017年10月16日
 */
public class Resume implements Cloneable{

	private String name;
	
	private String gender;
	
	private int age;
	
	private WorkExperience experience;
	
	/**
	 * @return the experience
	 */
	public WorkExperience getExperience() {
		return experience;
	}

	/**
	 * @param experience the experience to set
	 */
	public void setExperience(WorkExperience experience) {
		this.experience = experience;
	}

	public Resume() {
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}


	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}


	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}


	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	public void dispaly() {
		System.out.println(name+" "+gender+" "+age);
		System.out.println("工作经历  "+experience.getTimeArea()+" "+experience.getCompany());
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
