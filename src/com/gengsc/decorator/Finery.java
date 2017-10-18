package com.gengsc.decorator;

/**
 * @author shichaogeng
 *
 * 2017年10月12日
 */
public class Finery implements Showable {
	
	protected Showable showable;
	
	/**
	 * @author shichaogeng
	 * @date 2017年10月12日
	 */
	public Finery(){}
	
	public Finery(Showable showable) {
		this.showable = showable;
	}

	/**
	 * @author shichaogeng
	 * @date 2017年10月12日
	 */
	@Override
	public void show() {
		System.out.println("装扮");
		
		if (null != showable) {
			showable.show();
		}
		
	}
	
	public static void main(String[] args) {
		new Finery(new Person("小菜")).show();
	}

}
