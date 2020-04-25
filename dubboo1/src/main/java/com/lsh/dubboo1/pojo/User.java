package com.lsh.dubboo1.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * @Description:
 * @author: LuShao
 * @create: 2020-04-24 20:42
 **/
public class User implements Serializable {
	
	private String name;
	private Integer age;
	private Date birthday;
	
	public User(String name,Integer age,Date birthday) {
		this.name=name;
		this.age=age;
		this.birthday=birthday;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
}
