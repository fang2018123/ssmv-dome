package com.fyx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fyx.dao.UserDao;
import com.fyx.entity.UserEntity;
import com.fyx.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;
	
	@Override
	public UserEntity getUserEntityById(String userId) {
		return this.userDao.getUserEntityById(userId); 
	}

	@Override
	public List<UserEntity> getUserEntities() {
		return this.userDao.getUserEntities(); 
	}

	@Override
	public UserEntity insertUserEntity(UserEntity userEntity) {
		this.userDao.insertUser(userEntity);  
        return getUserEntityById(userEntity.getId()); 
	}

}
