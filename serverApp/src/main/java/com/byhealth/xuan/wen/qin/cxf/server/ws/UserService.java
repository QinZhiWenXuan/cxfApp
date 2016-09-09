package com.byhealth.xuan.wen.qin.cxf.server.ws;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.byhealth.xuan.wen.qin.cxf.server.model.UserModel;

/***
 * UserService<br>
 * 
 * @Remark 
 * 
 * @Date 2016年9月9日 上午11:05:35
 * @Author qinzhiwenxuan
 * @Email qinzhiwenxuan@gmail.com
 * @Version 1.0
 * @Address by-health
 */
@WebService
public interface UserService {
	@WebMethod
	UserModel findById (@WebParam(name = "id") long id) ;
	@WebMethod
	long add (@WebParam(name = "model") UserModel model) ;
	@WebMethod
	boolean delete (@WebParam(name = "id") long id) ;
	@WebMethod
	List<UserModel> findAll() ;
	@WebMethod
	String singin (@WebParam(name = "userName")String userName , @WebParam(name = "password")String password) ;
}
