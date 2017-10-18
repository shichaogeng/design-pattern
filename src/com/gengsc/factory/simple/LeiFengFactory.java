package com.gengsc.factory.simple;

import com.gengsc.factory.LeiFeng;
import com.gengsc.factory.UnderGraduate;
import com.gengsc.factory.Volunteer;

/**
 * @author shichaogeng
 *
 * 2017年10月16日
 */
public class LeiFengFactory {

	public static LeiFeng createLeiFeng(String type) {
		LeiFeng leiFeng = null;
		switch (type) {
		case "学雷锋大学生":
			leiFeng = new UnderGraduate();
			break;
		case "志愿者":
			leiFeng = new Volunteer();
			break;
		}
		
		return leiFeng;
	}
}
