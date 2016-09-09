package com.byhealth.xuan.wen.qin.cxf.server.ws.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.annotation.PostConstruct;
import javax.jws.WebService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.byhealth.xuan.wen.qin.cxf.server.model.UserModel;
import com.byhealth.xuan.wen.qin.cxf.server.ws.UserService;

/***
 * UserServiceImpl<br>
 * 
 * @Remark
 * 
 * @Date 2016年9月9日 上午11:07:14
 * @Author qinzhiwenxuan
 * @Email qinzhiwenxuan@gmail.com
 * @Version 1.0
 * @Address by-health
 */
@WebService(endpointInterface = "com.byhealth.xuan.wen.qin.cxf.server.ws.UserService", serviceName = "userService", name = "userService")
public class UserServiceImpl implements UserService {
	private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
	private static final Map<Long, UserModel> TABLE = new Hashtable<>();

	@PostConstruct
	private void init() {
		logger.debug("UserServiceImpl.init 。。。。。。。");
		TABLE.put((long) 1, new UserModel(1, "王尼玛", "123789", 20, true, new Date()));
		TABLE.put((long) 2, new UserModel(2, "贾承恺", "985136", 23, true, new Date()));
	}

	@Override
	public UserModel findById(long id) {
		return TABLE.get(id);
	}

	@Override
	public long add(UserModel model) {
		TABLE.put(model.getId(), model);
		return model.getId();
	}

	@Override
	public boolean delete(long id) {
		TABLE.remove(id);
		return true;
	}

	@Override
	public List<UserModel> findAll() {
		List<UserModel> result = new ArrayList<>();
		TABLE.values().forEach(model -> result.add(model));
		return result;
	}

	@Override
	public String singin(String userName, String password) {
		return UUID.randomUUID().toString();
	}

}
