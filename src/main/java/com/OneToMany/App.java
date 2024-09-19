package com.OneToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class App {

	public static void main(String[] args) {
		SessionFactory ssf = hibernateConfig.getSessionFactory();
		Address1 ad1 = new Address1("Patan");
		Address1 ad2 = new Address1("Umbraj");
		Address1 ad3 = new Address1("Masur");

		List<Address1> al = new ArrayList<Address1>();
		al.add(ad1);
		al.add(ad2);
		al.add(ad3);
		
		Person p = new Person("Raju", al);
		
		Session ss = ssf.openSession();
		
		Transaction tn = ss.beginTransaction();
		
		ss.save(ad1);
		ss.save(ad2);
		ss.save(ad3);
		ss.save(p);
		
		tn.commit();
		ss.close();
	}
	

}
