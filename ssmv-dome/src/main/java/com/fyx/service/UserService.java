package com.fyx.service;

import java.util.List;

import com.fyx.entity.UserEntity;

public interface UserService {
	
	public UserEntity getUserEntityById(String userId);  
    
	public List<UserEntity> getUserEntities();  
    
	public UserEntity insertUserEntity(UserEntity userEntity);   

}
