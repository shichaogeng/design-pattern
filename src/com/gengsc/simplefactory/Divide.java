package com.gengsc.simplefactory;

/**
 * @author shichaogeng
 *
 * 2017年10月10日
 */
public class Divide implements Operation {

	/**
	 * @author shichaogeng
	 * @date 2017年10月10日
	 * @param firstNumber
	 * @param secondNumber
	 * @return
	 */
	@Override
	public String getResult(double firstNumber, double secondNumber) {
		if (0 == secondNumber) {
			System.err.println("除数不能为0");
		}
		return String.valueOf(firstNumber/secondNumber);
	}

}
