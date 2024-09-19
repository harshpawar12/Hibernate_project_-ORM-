package com.OneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class App {

	public static void main(String[] args) {

		SessionFactory ssf = hibernateConfig.getSessionFactory();
		Address ad = new Address("Karad", "Maharashtra");
		Stud ob = new Stud("Aditya", "Java", ad);
		
		Session ss = ssf.openSession();
		
		Transaction tf = ss.beginTransaction();
		
		ss.save(ad);
		ss.save(ob);
		
		tf.commit();
		ss.close();
		
		System.out.println("Data inserted.");
	}

}
