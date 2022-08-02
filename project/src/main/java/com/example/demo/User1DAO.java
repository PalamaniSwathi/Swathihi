package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
@Repository
public interface User1DAO extends JpaRepository<User1, Integer> {
   
	@Query("from User1 where uname=?1 and pass=?2")
	public List<User1> CheckUser(String name,String pass);
	
	@Query("from User1 order by uid ASC")
	public List<User1> checkUID(User1 us);
	}
	

