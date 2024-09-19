package com.ManyToMany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Worker {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	
	@ManyToMany
	private List<Project> proid;

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

	public List<Project> getPro_id() {
		return proid;
	}

	public void setProid(List<Project> pro_id) {
		this.proid = pro_id;
	}

	public Worker() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Worker(String name, List<Project> pro_id) {
		super();
		this.name = name;
		this.proid = pro_id;
	}
	
	

}
