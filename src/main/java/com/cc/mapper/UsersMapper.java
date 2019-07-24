package com.cc.mapper;

import com.cc.pojo.Users;

import java.util.List;

public interface UsersMapper {
	/**
	 * 新增用户
	 * @param users
	 */
	void insUser(Users users);

	/**
	 * 查询所有用户
	 * @return
	 */
	List<Users> selUsersAll();

	/**
	 * 根据id查询用户
	 * @param id
	 * @return
	 */
	Users selUsersById(Integer id);

	/**
	 * 更新用户
	 * @param users
	 */
	void update(Users users);

	/**
	 * 删除用户
	 * @param id
	 */
	void delUserById(Integer id);
}
