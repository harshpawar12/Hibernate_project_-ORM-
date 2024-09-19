package com.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class dataFetch {

	public static void main(String[] args) {
		SessionFactory sf = hibernateConfig.getSession();
		Session ss = sf.openSession();
		
	/*	get() method will return null if id is not present in the DB
		Employee ob = ss.get(Employee.class, 10);
		System.out.println(ob);
		Employee ob2 = ss.get(Employee.class, 20);
		System.out.println(ob2);
	*/
	/*	load() method will throw an expection if id is not present in DB 
		Employee ob = ss.load(Employee.class, 10);
		Employee ob2 = ss.load(Employee.class, 20);
		System.out.println(ob2);
	*/
		
		Employee ob = ss.get(Employee.class, 10);
		System.out.println(ob);
		Employee ob2 = ss.load(Employee.class, 2);
		System.out.println(ob2);
	}

}
