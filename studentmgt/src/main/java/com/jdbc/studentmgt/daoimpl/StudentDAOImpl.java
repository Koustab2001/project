package com.jdbc.studentmgt.daoimpl;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;


import com.jdbc.studentmgt.dao.StudentDAO;
import com.jdbc.studentmgt.entity.Address;
import com.jdbc.studentmgt.entity.Student;
import com.jdbc.studentmgt.util.HiberUtil;

public class StudentDAOImpl implements StudentDAO {
	
	HiberUtil hu=new HiberUtil();
	Session session=hu.getSession();
	
	public Student getStudent(int id) {
		
		return session.get(Student.class, id);
		
	}	
	

	public void deleteStudent(int id) {
		Student s=getStudent(id);
		Transaction tx=session.beginTransaction();
		session.delete(s);
		tx.commit();
}

	public void updateStudent(int id, String name, String contact, Address address) {
		Student s=getStudent(id);
		s.setSname(name);
		s.setContact(contact);
		s.setAddress(address);
		Transaction tx=session.beginTransaction();
		session.update(s);
		tx.commit();
		System.out.println("Updated Successfully....");
		
		
	}

	public void insertStudent(int id, String name, String contact, Address address) {
       Transaction tx=session.beginTransaction();
		
		Student s=new Student(id,name,contact, address);
		s.setAddress(address);
		session.save(s);
		tx.commit();
	    System.out.println("Record inserted successfully....");
	    
	  
		
		
	}
	
	//session close method
		public void closeSession() {
			session.close();
		}
}
