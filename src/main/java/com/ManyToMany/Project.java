package com.ManyToMany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project 
{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int pid;
	private String pname;
	
	@ManyToMany
	private List<Worker> wrkId;

	public Project(String pname, List<Worker> wrkId) {
		super();
		this.pname = pname;
		this.wrkId = wrkId;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public List<Worker> getWrkId() {
		return wrkId;
	}

	public void setWrkId(List<Worker> wrkId) {
		this.wrkId = wrkId;
	}

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
