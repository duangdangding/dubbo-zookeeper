package com.lsh.dubboc1.ctroller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lsh.dubboo1.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Description:
 * @author: LuShao
 * @create: 2020-04-24 19:41
 **/
@Controller
public class UserCtr {
	
	//这是dubbo的注解，意思是从dubbo服务上查找关联
	@Reference
	private UserService userService;
	
	@RequestMapping("/getuser")
	@ResponseBody
	public List getUsers() {
		return userService.getUser();
	}
}
