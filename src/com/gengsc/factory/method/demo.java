package com.gengsc.factory.method;

import com.gengsc.factory.LeiFeng;

/**
 * @author shichaogeng
 *
 * 2017年10月16日
 */
public class demo {

	public static void main(String[] args) {
		LeiFeng leiFeng = new UnderGraduateFactory().createLeiFeng();
		leiFeng.sweep();
		leiFeng.wash();
		leiFeng.buyRice();
		
		LeiFeng leiFeng2 = new VolunteerFactory().createLeiFeng();
		leiFeng2.sweep();
		leiFeng2.wash();
		leiFeng2.buyRice();
	}
}
