package com.gengsc.strategy;

import java.util.Scanner;

/**
 * @author shichaogeng
 *
 * 2017年10月10日
 */
public class dispaly {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入第一个数：");
		double firstNumber = Double.valueOf(scanner.nextLine());
		System.out.println("请输入运算符");
		String operator = scanner.nextLine();
		System.out.println("请输入第二个数：");
		double secondNumber = Double.valueOf(scanner.nextLine());
		
		String result = new OperationContext(operator).getResult(firstNumber, secondNumber);
	
		System.out.println("运算结果： "+result);
	}
}
