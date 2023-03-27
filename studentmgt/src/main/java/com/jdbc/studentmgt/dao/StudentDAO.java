package com.jdbc.studentmgt.dao;


	import java.util.List;

	import javax.transaction.Transaction;

	import org.hibernate.Session;

import com.jdbc.studentmgt.entity.Address;
import com.jdbc.studentmgt.entity.Student;

	public interface StudentDAO {
		
		public void closeSession();
		public Student getStudent(int id);
		public void deleteStudent(int id);
		public void updateStudent(int id, String name, String contact,Address address);
		public void insertStudent(int id, String name, String contact,Address address);
}
