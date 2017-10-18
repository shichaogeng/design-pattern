package com.gengsc.factorymethod;

/**
 * @author shichaogeng
 *
 * 2017年10月13日
 */
public class MultiplyFactory implements OperationFactory{

	/**
	 * @author shichaogeng
	 * @date 2017年10月13日
	 * @return
	 */
	@Override
	public Operation createOperation() {
		return new Multiply();
	}

}
