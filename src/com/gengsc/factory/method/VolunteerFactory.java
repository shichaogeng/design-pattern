package com.gengsc.factory.method;

import com.gengsc.factory.LeiFeng;
import com.gengsc.factory.Volunteer;

/**
 * @author shichaogeng
 *
 * 2017年10月16日
 */
public class VolunteerFactory implements LeiFengFactory {

	/**
	 * @author shichaogeng
	 * @date 2017年10月16日
	 * @return
	 */
	@Override
	public LeiFeng createLeiFeng() {
		return new Volunteer();
	}

}
