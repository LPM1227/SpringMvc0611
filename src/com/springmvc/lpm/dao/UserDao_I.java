package com.springmvc.lpm.dao;

import java.util.List;

import com.springmvc.lpm.entities.UserEntity;

public interface  UserDao_I {
	public List<UserEntity> getUserName(UserEntity user);
	
}