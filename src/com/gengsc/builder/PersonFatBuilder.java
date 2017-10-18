package com.gengsc.builder;

/**
 * @author shichaogeng
 *
 * 2017年10月17日
 */
public class PersonFatBuilder extends PersonBuilder {

	/**
	 * @author shichaogeng
	 * @date 2017年10月17日
	 */
	@Override
	public void BuildHead() {
		System.out.println("fat head");
	}

	/**
	 * @author shichaogeng
	 * @date 2017年10月17日
	 */
	@Override
	public void BuildBody() {
		System.out.println("fat body");
	}

	/**
	 * @author shichaogeng
	 * @date 2017年10月17日
	 */
	@Override
	public void BuildLeftArm() {
		System.out.println("fat left arm");
	}

	/**
	 * @author shichaogeng
	 * @date 2017年10月17日
	 */
	@Override
	public void BuildRightArm() {
		System.out.println("fat right arm");
	}

	/**
	 * @author shichaogeng
	 * @date 2017年10月17日
	 */
	@Override
	public void BuildLeftLeg() {
		System.out.println("fat left leg");
	}

	/**
	 * @author shichaogeng
	 * @date 2017年10月17日
	 */
	@Override
	public void BuildRightLeg() {
		System.out.println("fat right leg");
	}

}
