package com.byhealth.xuan.wen.qin.cxf.server.model;

import java.io.Serializable;
import java.util.Date;

/***
 * UserModel<br>
 * 
 * @Remark
 * 
 * @Date 2016年9月9日 上午11:45:19
 * @Author qinzhiwenxuan
 * @Email qinzhiwenxuan@gmail.com
 * @Version 1.0
 * @Address by-health
 */
public class UserModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long id;
	private String userName;
	private String password ;
	private int age;
	private boolean sex;
	private Date initDate;

	public UserModel() {
		super();
	}

	public UserModel(long id, String userName, String password, int age, boolean sex, Date initDate) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.age = age;
		this.sex = sex;
		this.initDate = initDate;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isSex() {
		return sex;
	}

	public void setSex(boolean sex) {
		this.sex = sex;
	}

	public Date getInitDate() {
		return initDate;
	}

	public void setInitDate(Date initDate) {
		this.initDate = initDate;
	}

	@Override
	public String toString() {
		return "UserModel [id=" + id + ", userName=" + userName + ", age=" + age + ", sex=" + sex + ", initDate="
				+ initDate + "]";
	}

}
