package com.springmvc.lpm.controllers;



import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springmvc.lpm.entities.UserEntity;
import com.springmvc.lpm.services.LoginService;

@Controller

//@RequestMapping("/queryUser")
public class LoginController {
	 
	@Resource
	private LoginService loginService;
    @RequestMapping(value="/login",method=RequestMethod.POST)  
    public String IndexControl(UserEntity user) throws Exception {
    	/*boolean b = loginService.login(user);
    	String userName = user.getUserName();
    	String passWord = user.getPassWord();
    	if(!b){
    		
    		return "../../index";
    	}*/
    	
    	List<UserEntity> list= loginService.login(user);
    	
    	if(null!=list&&list.size()>0){
    		
    		return "success";
    	}else{
    		
    	}
    	return "../../index";
    }
}
