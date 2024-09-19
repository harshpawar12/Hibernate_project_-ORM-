package com.OneToMany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;

	@OneToMany
	private List<Address1> addr;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Address1> getAddr() {
		return addr;
	}

	public void setAddr(List<Address1> addr) {
		this.addr = addr;
	}

	public Person(String name, List<Address1> addr) {
		super();
		this.name = name;
		this.addr = addr;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
