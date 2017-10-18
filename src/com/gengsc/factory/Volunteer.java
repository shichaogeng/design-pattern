package com.gengsc.factory;

/**
 * @author shichaogeng
 *
 * 2017年10月16日
 */
public class Volunteer  implements LeiFeng{

	/**
	 * @author shichaogeng
	 * @date 2017年10月16日
	 */
	@Override
	public void sweep() {
		System.out.println("志愿者扫地");
	}

	/**
	 * @author shichaogeng
	 * @date 2017年10月16日
	 */
	@Override
	public void wash() {
		System.out.println("志愿者洗衣服");
	}

	/**
	 * @author shichaogeng
	 * @date 2017年10月16日
	 */
	@Override
	public void buyRice() {
		System.out.println("志愿者买米");
	}

}
