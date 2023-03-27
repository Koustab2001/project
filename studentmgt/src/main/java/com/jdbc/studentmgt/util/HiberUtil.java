package com.jdbc.studentmgt.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HiberUtil {
	
	public Session getSession()
	{
			Configuration cfg=new Configuration();
	        cfg.configure();
	        SessionFactory factory=cfg.buildSessionFactory();
	        Session session=factory.openSession();
	        return session;
}
}