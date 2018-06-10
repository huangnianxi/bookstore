package com.bookstore.service;

import com.bookstore.message.ResponseMes;

public interface UserService {
	/**用户获取自己的信息
	 * @param userName 用户的账号
	 * @return 成功或失败信息,包含用户的实体类
	 */
	public ResponseMes getUser(String userName);

	/**
	 * 用户注册
	 * @param userName 账号
	 * @param password 密码
	 * @param phone 联系方式
	 * @param realName 真实名字
	 * @param address 地址
	 * @return 注册成功或失败信息
	 */
	public ResponseMes insertUser(String userName, String password, String phone, String realName, String address);
}
