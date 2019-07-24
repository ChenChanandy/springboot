package com.cc.service;

import com.cc.pojo.Users;

import java.util.List;

public interface UsersService {
	/**
	 * 增加用户
	 * @param users
	 */
	void addUser(Users users);
	
	/**
	 * 查询所有用户
	 * @return
	 */
	List<Users> findAll();

	/**
	 * 根据id查询用户
	 * @param id
	 * @return
	 */
	Users findUserById(Integer id);

	/**
	 * 更新用户
	 * @param users
	 */
	void update(Users users);

	/**
	 * 删除用户
	 * @param users
	 */
	void delete(Integer id);
}
