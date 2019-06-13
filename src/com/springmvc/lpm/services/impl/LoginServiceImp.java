package com.springmvc.lpm.services.impl;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.springmvc.lpm.dao.UserDao;
import com.springmvc.lpm.dao.UserDao_I;
import com.springmvc.lpm.entities.UserEntity;
import com.springmvc.lpm.services.LoginService;
@Service
public class LoginServiceImp implements LoginService {

	@Resource
	UserDao_I userDao_I;
	@Override
	public List<UserEntity> login(UserEntity user) {
		// TODO Auto-generated method stub
		/*ApplicationContext factory = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao) factory.getBean("userDao");
		List a = userDao.getUserName(user);*/
		
		List<UserEntity> list = userDao_I.getUserName(user);
		
		return list;
	}

}
