package com.fyx.entity;

import java.io.Serializable;

//@Alias("user")
public class UserEntity implements Serializable{
	
	private String id;  
    private String userName;  
    private String password;  
    private String sex;  
    private String email; 
   
    public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUserName() {  
        return userName;  
    }  
    public void setUserName(String userName) {  
        this.userName = userName;  
    }  
    public String getPassword() {  
        return password;  
    }  
    public void setPassword(String password) {  
        this.password = password;  
    }  
    public String getSex() {  
        return sex;  
    }  
    public void setSex(String sex) {  
        this.sex = sex;  
    }  
    public String getEmail() {  
        return email;  
    }  
    public void setEmail(String email) {  
        this.email = email;  
    }  
    @Override  
    public String toString() {  
        return "UserEntity [userId=" + id + ", userName=" + userName  
                + ", password=" + password + ", sex=" + sex + ", email="  
                + email + "]";  
    }  

}
