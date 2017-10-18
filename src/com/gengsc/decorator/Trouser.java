package com.gengsc.decorator;

/**
 * @author shichaogeng
 *
 * 2017年10月12日
 */
public class Trouser extends Finery {

	public Trouser() {}
	
	/**
	 * @param showable
	 */
	public Trouser(Showable showable) {
		super(showable);
		System.out.println("裤衩子");
		
	}
	
}
