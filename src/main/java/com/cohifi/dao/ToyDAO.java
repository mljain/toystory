package com.cohifi.dao;

import java.util.List;

import com.cohifi.domain.Toy;


public interface ToyDAO {
	public List<Toy> getToyListByUser(int userId) ;
	public List<Toy> getToyListShared(List<Integer> users) ;

}
