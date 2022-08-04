package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ShopDAO extends JpaRepository<Shopping, Integer> {
 

	@Query("from Shopping where name=?1 and pass=?2")
	public List<Shopping> CheckUser(String name,String pass);
	
	@Query("from Shopping order by id ASC")
	public List<Shopping> checkUID(Shopping sh);
}
