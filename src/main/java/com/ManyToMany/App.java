package com.ManyToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class App {

	public static void main(String[] args) {
		Worker w1 = new Worker();
		w1.setName("Aditya");
		Worker w2 = new Worker();
		w2.setName("Omkar");
		
		List<Worker> wlist = new ArrayList<Worker>();
		wlist.add(w1);
		wlist.add(w2);
		
		Project p1 = new Project();
		p1.setPname("Tender Management System");
		Project p2 = new Project();
		p2.setPname("Hospital Management System");
		
		List<Project> plist = new ArrayList<Project>();
		plist.add(p1);
		plist.add(p2);
		
		w1.setProid(plist);
		w2.setProid(plist);
		
		p1.setWrkId(wlist);
		p2.setWrkId(wlist);
		
		SessionFactory ssf = hibernateConfig.getSessionFactory();
		
		Session ss =  ssf.openSession();
		
		Transaction tn = ss.beginTransaction();
		
		ss.save(w1);
		ss.save(w2);
		ss.save(p1);
		ss.save(p2);
		
		tn.commit();
		
		ss.close();
		
		System.out.println("Data inserted.");
	}
}
