package com.lsh.dubbop1.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.lsh.dubboo1.pojo.User;
import com.lsh.dubboo1.service.UserService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Description:
 * @author: LuShao
 * @create: 2020-04-24 19:00
 **/
// 这里的@Service注解不是spring的而是dubbo的导入的时候要看清楚
@Service
@Component
public class UserServiceImpl implements UserService {

	@Override
	public List<User> getUser() {
		List<User> list = new ArrayList<>();
		list.add(new User("ll",112,new Date()));
		list.add(new User("lsl",122,new Date()));
		list.add(new User("ldl",152,new Date()));
		list.add(new User("lg",142,new Date()));
		return list;
	}
}
