package com.demo;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        SessionFactory sf = hibernateConfig.getSession();
        System.out.println(sf);
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your ID : ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter your Name : ");
        String name = sc.nextLine();
        
        Employee ob = new Employee(id, name);
        
        Session ss = sf.openSession();
        
        Transaction ts = ss.beginTransaction();
        ss.save(ob);
        ts.commit();
        ss.close();
        
        
    }
}
