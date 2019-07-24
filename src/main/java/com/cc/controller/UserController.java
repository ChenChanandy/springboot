package com.cc.controller;

import com.cc.pojo.Users;
import com.cc.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 *  	整合jsp
 * @author qz
 *
 */
@Controller
@RequestMapping("/users")
public class UserController {
	@Autowired
	private UsersService usersServiceImpl;
	
	/**
	 * 		页面跳转
	 * @param page
	 * @return
	 */
	@RequestMapping("/{page}")
	public String showPage(@PathVariable String page) {
		return page;
	}
	
	/**
	 * 增加用户
	 * @param users
	 * @return
	 */
	@RequestMapping("/addUser")
	public String addUser(Users users) {
		this.usersServiceImpl.addUser(users);
		//return "redirect:/users/findAll";
		return "ok";
	}
	
	/**
	 * 查询全部用户
	 * @param model
	 * @return
	 */
	@RequestMapping("/findAll")
	public String findAll(Model model) {
		List<Users> list = usersServiceImpl.findAll();
		model.addAttribute("list", list);
		return "user";
	}

	/**
	 * 根据id查询用户
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/findOne")
	public String findUserById(Integer id,Model model){
		Users user = usersServiceImpl.findUserById(id);
		model.addAttribute("user", user);
		return "update";
	}

	/**
	 * 更新用户
	 * @param users
	 * @return
	 */
	@RequestMapping("/update")
	public String update(Users users){
		usersServiceImpl.update(users);
		return "ok";
	}

	/**
	 * 删除用户
	 * @param id
	 * @return
	 */
	@RequestMapping("/delete")
	public String delete(Integer id){
		usersServiceImpl.delete(id);
		return "redirect:/users/findAll";
	}
}
