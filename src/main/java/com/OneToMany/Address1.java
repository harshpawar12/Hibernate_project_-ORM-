package com.OneToMany;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address1 {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int aid;
	private String addr;
	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public Address1(String addr) {
		super();
		this.addr = addr;
	}
	public Address1() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
