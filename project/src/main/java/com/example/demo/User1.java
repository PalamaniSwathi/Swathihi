package com.example.demo;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Size;
@Entity
public class User1 {
	@Id
	private int uid;
	@Size(min=3,max=15)
	private String uname;
	private String pass;

	private String image;
	private String city;
	private String address;
	private int flag;
	private String phonenumber;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getpass() {
		return pass;
	}
	public void setUpass(String pass) {
		this.pass = pass;
	}

	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getFlag() {
		return flag;
	}
	public void setFlag(int flag) {
		this.flag = flag;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	
	
	
}
	
	
	