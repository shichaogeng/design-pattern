package com.gengsc.builder;

/**
 * @author shichaogeng
 *
 * 2017年10月17日
 */
public class PersonThinBuilder extends PersonBuilder {

	/**
	 * @author shichaogeng
	 * @date 2017年10月17日
	 */
	@Override
	public void BuildHead() {
		System.out.println("thin head");
	}

	/**
	 * @author shichaogeng
	 * @date 2017年10月17日
	 */
	@Override
	public void BuildBody() {
		System.out.println("thin body");
	}

	/**
	 * @author shichaogeng
	 * @date 2017年10月17日
	 */
	@Override
	public void BuildLeftArm() {
		System.out.println("thin left arm");
	}

	/**
	 * @author shichaogeng
	 * @date 2017年10月17日
	 */
	@Override
	public void BuildRightArm() {
		System.out.println("thin right arm");
	}

	/**
	 * @author shichaogeng
	 * @date 2017年10月17日
	 */
	@Override
	public void BuildLeftLeg() {
		System.out.println("thin left leg");
	}

	/**
	 * @author shichaogeng
	 * @date 2017年10月17日
	 */
	@Override
	public void BuildRightLeg() {
		System.out.println("thin right leg");
	}

}
