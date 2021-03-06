package com.cohifi.dao;

import java.util.List;

import com.cohifi.domain.User;


public interface UserDAO {

	public int getUserCount();

	public String findUserNameById(int id);

	public User findUserByName(String userName);

	public void insertUser(List<User> users);
	
	public void deleteUser(int userid);
	
	public List<User> getUserallList() ;
	
	public int updateBillOfAllUsers();
	
	public double getTotalBillOfUser(int userid);
	
	public double getTotalBillOfAllUsers();
}
