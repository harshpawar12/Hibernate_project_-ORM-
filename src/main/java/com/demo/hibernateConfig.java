package com.demo;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

public class hibernateConfig {

	public static SessionFactory sf;
	
	public static SessionFactory getSession()
	{
		Configuration cfg = new Configuration();
		Properties ppt = new Properties();
		
		ppt.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
		ppt.put(Environment.URL, "jdbc:mysql://localhost:3306/delta_hibernate");
		ppt.put(Environment.USER, "root");
		ppt.put(Environment.PASS, "12345");
		ppt.put(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");
		ppt.put(Environment.HBM2DDL_AUTO, "update");
		ppt.put(Environment.SHOW_SQL, "true");
		
		cfg.setProperties(ppt);
		cfg.addAnnotatedClass(Employee.class);
		
		ServiceRegistry ssr = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()).build();
		
		sf = cfg.buildSessionFactory(ssr);
		return sf;
		
	}
	
}
