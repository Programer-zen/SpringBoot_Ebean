package com.cheng.controller;

import com.cheng.mathserver.bean.Point_getName;
import com.cheng.model.Mail;
import com.cheng.model.User;
import com.cheng.service.UserService;
import com.googlecode.aviator.AviatorEvaluator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {
	@RequestMapping("a")
	@PostMapping
	public String  aa() {
		String sRule = "Val(dsdas)";//ture
		AviatorEvaluator.addFunction(new Point_getName());//添加组件
		String result = String.valueOf(AviatorEvaluator.execute(sRule));
		System.out.println("result : " + result);
		return result;
	}


	@Autowired
	private UserService userService;

	@RequestMapping("user/getAll")
	public List<User> getAll() {
		return userService.getAll();
	}

	@RequestMapping("user/getById")
	@PostMapping
	public List<Mail> getById(@RequestParam(value = "id") Integer id) {
		return userService.getById(id);
	}

	@RequestMapping("/test")
	public List test() {
		return userService.test();
	}

}
