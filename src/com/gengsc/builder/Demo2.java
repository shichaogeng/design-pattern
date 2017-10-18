package com.gengsc.builder;

/**
 * @author shichaogeng
 *
 * 2017年10月17日
 */
public class Demo2 {

	public static void main(String[] args) {
		
		new PersonDirector(new PersonThinBuilder()).createPerson();
		
		new PersonDirector(new PersonFatBuilder()).createPerson();
	}
}
