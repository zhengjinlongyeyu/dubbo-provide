package com.provide.serivce.impl;

import org.apache.dubbo.config.annotation.Service;

import com.api.service.UserService;
import com.api.service.entity.User;
/**
 * 
 * @description  @Service 是dubbo下面的
 * @author Jeff
 * @date 2022年3月16日
 */
@Service(version="1.0")
public class UserServiceImpl  implements UserService{

	@Override
	public User getUserById(Integer id) {
		System.out.println("服务提供方收到消息+++++++++》");
		User user = new User();
		user.setId(10);
		user.setUserName("admin");
		return user;
	}

}
