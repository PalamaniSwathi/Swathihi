package com.example.demo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ShopServices {
	@Autowired
	
	private ShopDAO sdao;

	public ShopDAO getSdao() {
		return sdao;
	}

	public void setSdao(ShopDAO sdao) {
		this.sdao = sdao;
	}

	public void saveUser1(Shopping sh) {
		getSdao().save(sh);
	}
public List<Shopping> checkUser(String name,String pass){
		
		return getSdao().CheckUser(name, pass);
		
	}
	
	public List<Shopping> checkUID(Shopping sh) {
		
		return getSdao().checkUID(sh);
		
	}
}
