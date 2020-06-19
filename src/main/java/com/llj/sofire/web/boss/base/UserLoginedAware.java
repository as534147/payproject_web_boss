package com.llj.sofire.web.boss.base;

import com.llj.sofire.user.entity.PmsUser;





public interface UserLoginedAware {

	/**
	 * 取得登录的用户
	 * 
	 * @return
	 */
	public PmsUser getLoginedUser();
}
