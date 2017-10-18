package com.gengsc.simplefactory;

/**
 * @author shichaogeng
 *
 * 2017年10月10日
 */
public class Substract implements Operation {

	/**
	 * @author shichaogeng
	 * @date 2017年10月10日
	 * @param firstNumber
	 * @param secondNumber
	 * @return
	 */
	@Override
	public String getResult(double firstNumber, double secondNumber) {
		return String.valueOf(firstNumber - secondNumber);
	}

}
