package com.gengsc.builder;

/**
 * @author shichaogeng
 *
 * 2017年10月17日
 */
public class PersonDirector {

	private PersonBuilder builder;
	
	public PersonDirector( PersonBuilder builder) {
		this.builder = builder;
	}
	
	public void  createPerson() {
		builder.BuildHead();
		builder.BuildBody();
		builder.BuildLeftArm();
		builder.BuildRightArm();
		builder.BuildLeftLeg();
		builder.BuildRightLeg();
	}
}
