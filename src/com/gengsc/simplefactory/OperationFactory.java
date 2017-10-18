package com.gengsc.simplefactory;

/**
 * @author shichaogeng
 *
 * 2017年10月10日
 */
public class OperationFactory {
	
	private OperationFactory() {}
	
	public static Operation getObject(String operator) {
		Operation operation = null;
		switch (operator) {
		case "+":
			operation = new Add();
			break;
		case "-":
			operation = new Substract();
			break;
		case "*":
			operation = new Multiply();
			break;
		case "/":
			operation = new Divide();
			break;
		default:
			System.err.println("不支持此运算");
			break;
		}
		
		return operation;
	}
}
