package com.velocity.entity;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainTest {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Customer customer=new Customer();
		customer.setName("shweta");
		customer.setMobilenumber(23456789);
		
		Transection transection=new Transection();
		transection.settName("xx22zz");
		transection.setDate(new Date());
		
		customer.setTransaction(transection);
		
		session.save(customer);
		transaction.commit();
		session.close();
		sessionFactory.close();
		

	}

}
