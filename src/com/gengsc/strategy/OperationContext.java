package com.gengsc.strategy;

/**
 * @author shichaogeng
 *
 * 2017年10月10日
 */
public class OperationContext {
	
	private Operation operation;

	public OperationContext(String operator) {
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
			System.err.println("不支持此运算");;
			break;
		}
	}
	
	public String getResult(double firstNumber, double secondNumber){
		return operation.getResult(firstNumber, secondNumber);
	}
}
