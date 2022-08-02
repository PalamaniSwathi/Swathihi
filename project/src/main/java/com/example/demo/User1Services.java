package com.example.demo;



import java.util.List;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
@Transactional
public class User1Services {
	
	@Autowired
	private User1DAO udao;
	
	public User1DAO getUdao() {
		return udao;
	}
	
	public User1DAO setUdao() {
		return udao;
	}

	public void setUdao(User1DAO udao) {
		this.udao = udao;
	}

	public void saveUser1(User1 user) {
		getUdao().save(user);
	}
public List<User1> checkUser(String name,String pass){
		
		return getUdao().CheckUser(name, pass);
		
	}
	
	public List<User1> checkUID(User1 us) {
		
		return getUdao().checkUID(us);
		
	}
}


