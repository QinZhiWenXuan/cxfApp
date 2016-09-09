package com.byhealth.xuan.wen.qin.cxf.client.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.byhealth.xuan.wen.qin.cxf.server.ws.UserModel;
import com.byhealth.xuan.wen.qin.cxf.server.ws.UserService;

/***
 * UserController<br>
 * 
 * @Remark
 * 
 * @Date 2016年9月9日 下午2:06:29
 * @Author qinzhiwenxuan
 * @Email qinzhiwenxuan@gmail.com
 * @Version 1.0
 * @Address by-health
 */
@Controller
@RequestMapping(value = "/user/", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class UserController {
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	@Autowired
	private UserService userService ;
	@RequestMapping(value = "get/all" , method = {RequestMethod.GET})
	@ResponseBody
	public List<UserModel> findAll () {
		logger.debug("UserController.findAll。。。。。");
		return userService.findAll();
	}
	@RequestMapping(value = "get/{id}" , method = {RequestMethod.GET})
	@ResponseBody
	public UserModel findById (@PathVariable(value = "id") long id) {
		return userService.findById(id);
	}
}
