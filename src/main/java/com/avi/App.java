package com.avi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "project started" );
        SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
     Student st=new Student();
     st.setId(3);
     st.setName("omkar");
     st.setCity("pune");
     System.out.println(st);
     Session session= factory.openSession();
     Transaction tx= session.beginTransaction();
      session.save(st);
     tx.commit(); 
     session.close();
     
    }
}
