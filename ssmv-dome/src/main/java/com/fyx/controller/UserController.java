package com.fyx.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.fyx.core.mv.JModelAndView;
import com.fyx.entity.UserEntity;
import com.fyx.service.UserService;


@Controller
public class UserController {

	private static final Logger logger = Logger.getLogger(UserController.class);
	
	@Autowired
	private UserService userService;

	// http://localhost:8085/user_cms/userController/1/showUser.do
	@RequestMapping("/showUser/{id}")
	public String showUser(@PathVariable String id, ModelMap modelMap, HttpServletRequest request) {
		UserEntity u = userService.getUserEntityById(id);

		if (u == null) {
			u = new UserEntity();
			u.setEmail("");
			u.setId("");
		}
		modelMap.put("user", u);
		return "showUser";
	}

	// http://localhost:8085/user_cms/userController/showUser.do?id=1
	@RequestMapping("showUser")
	public String showUserEntity(String id, ModelMap modelMap, HttpServletRequest request) {
		UserEntity u = userService.getUserEntityById(id);
		if (u == null) {
			u = new UserEntity();
			u.setEmail("");
			u.setId("");
		}
		modelMap.put("user", u);
		return "showUser";
	}

	@RequestMapping("/showUserExample")
	public String showUsers(Model model) {
		return "redirect:/showUser.html/1";
	}

	@RequestMapping("/userList")
	public String list(ModelMap model) {
		model.put("users", userService.getUserEntities());
		return "list";
	}

	@RequestMapping("/userList1")
	public ModelAndView list(HttpServletRequest request, HttpServletResponse response) {
		
		ModelAndView mv = new JModelAndView("list", request, response);
		
		mv.addObject("users", userService.getUserEntities());
		return mv;

	}

	@RequestMapping("/user/{id}")
	public String detail(@PathVariable(value = "id") String id, ModelMap model) {
		model.put("user", userService.getUserEntityById(id));
		return "detail";
	}

}
