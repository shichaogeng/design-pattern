package com.gengsc.factory.simple;

import com.gengsc.factory.LeiFeng;

/**
 * @author shichaogeng
 *
 * 2017年10月16日
 */
public class demo {

	public static void main(String[] args) {
		LeiFeng leiFeng = LeiFengFactory.createLeiFeng("学雷锋大学生");
		leiFeng.sweep();
		leiFeng.wash();
		leiFeng.buyRice();
		
		LeiFeng leiFeng2 = LeiFengFactory.createLeiFeng("志愿者");
		leiFeng.sweep();
		leiFeng.wash();
		leiFeng.buyRice();
	}
}
