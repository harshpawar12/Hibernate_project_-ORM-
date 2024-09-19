package com.student;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class App {

	public static void main(String[] args) {
			
		SessionFactory sf = hibernateConfig.getSessionFactory();
		Scanner sc = new Scanner(System.in);
		System.out.println("***** Enter Student Details ****");
		System.out.print("Enter Id : ");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter Name : ");
		String name = sc.nextLine();
		System.out.print("Enter Course : ");
		String course = sc.nextLine();
		System.out.print("Enter City : ");
		String city = sc.nextLine();
		System.out.print("Enter Age : ");
		int age = sc.nextInt();
		
		Student ob = new Student(id, name, course, city, age);
		
		Session ss = sf.openSession();
		Transaction ts = ss.beginTransaction();
		
		ss.save(ob);
		ts.commit();
		
		ss.close();
	}
}
