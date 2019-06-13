package com.springmvc.lpm.services;

import java.util.List;

import com.springmvc.lpm.entities.UserEntity;

public interface LoginService {
	public List<UserEntity> login(UserEntity user);
}
