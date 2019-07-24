package com.cc.service.impl;

import com.cc.mapper.UsersMapper;
import com.cc.pojo.Users;
import com.cc.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UsersServiceImpl implements UsersService {
	@Autowired
	private UsersMapper usersMapper;
	
	@Override
	public void addUser(Users users) {
		this.usersMapper.insUser(users);
	}

	@Override
	public List<Users> findAll() {
		return usersMapper.selUsersAll();
	}

	@Override
	public Users findUserById(Integer id) {
		return usersMapper.selUsersById(id);
	}

	@Override
	public void update(Users users) {
		usersMapper.update(users);
	}

	@Override
	public void delete(Integer id) {
		usersMapper.delUserById(id);
	}

}
