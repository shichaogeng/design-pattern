package com.gengsc.decorator;

/**
 * @author shichaogeng
 *
 * 2017年10月12日
 */
public class Person implements Showable {

	private String name;

	public Person() {
	}
	
	public Person(String name) {
		this.name = name;
	}

	/**
	 * @author shichaogeng
	 * @date 2017年10月12日
	 */
	@Override
	public void show() {
		System.out.println(name);
	}
	
	
}
