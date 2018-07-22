package com.fyx.dao;

import java.util.List;

import com.fyx.entity.UserEntity;


public interface UserDao {
	
	public UserEntity getUserEntityById(String userId);  
    
	public List<UserEntity> getUserEntities();  
      
	public int insertUser(UserEntity userEntity); 

}
