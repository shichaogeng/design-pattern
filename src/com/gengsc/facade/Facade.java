package com.gengsc.facade;

/**
 * @author shichaogeng
 *
 * 2017年10月17日
 */
public class Facade {
	
	private SubSystemOne subSystemOne;
	private SubSystemTwo subSystemTwo;
	private SubSystemThree subSystemThree;
	private SubSystemFour subSystemFour;

	public Facade() {
		subSystemOne = new SubSystemOne();
		subSystemTwo = new SubSystemTwo();
		subSystemThree = new SubSystemThree();
		subSystemFour = new SubSystemFour();
	}
	
	public void methodA() {
		subSystemOne.methodOne();
		subSystemTwo.methodTwo();
		subSystemFour.methodFour();
	}
	
	public void methodB() {
		subSystemTwo.methodTwo();
		subSystemThree.methodThree();
	}
}
