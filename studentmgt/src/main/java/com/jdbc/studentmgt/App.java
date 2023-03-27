package com.jdbc.studentmgt;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import com.jdbc.studentmgt.dao.StudentDAO;
import com.jdbc.studentmgt.daoimpl.StudentDAOImpl;
import com.jdbc.studentmgt.entity.Address;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	StudentDAO sdao=new StudentDAOImpl();
    	
        Scanner scan=new Scanner(System.in);
        System.out.println("1. Create :");
    	System.out.println("2. Update :");
    	System.out.println("3. Delete :");
    	System.out.println("4. Retrieve :");
    	System.out.println("5. Exit");
    	
		Address add=new Address();
    	do{  
			System.out.println("Enter Choice:");
			//scan input from user
			int ch = scan.nextInt(),id = 0;
			String name = null, contact = null;
			//switch case for multiple cases
			switch (ch) {
			//case 1 for inserting value
			case 1: {
				System.out.println("Enter id :");
	    		id=scan.nextInt();
	    		
	    		System.out.println("Enter Name :");
	    		name=scan.next();
	    		System.out.println("Enter contact:");
	    		contact=scan.next();
	    		System.out.println("Enter House No.");
	    		String hno = scan.next();
	    		System.out.println("Enter Area");
	    		String area= scan.next();
	    		System.out.println("Enter State");
	    		String state= scan.next();
	    		System.out.println("Enter City");
				String city= scan.next();
				System.out.println("Enter PIN");
				int pin= scan.nextInt();  
				add.setHno(hno);
				add.setArea(area);
				add.setCity(city);
				add.setPin(pin);
				add.setState(state);
	    		sdao.insertStudent(id, name, contact,add);
	    		break;
			}
			//case 2 for update
			case 2: {
				System.out.println("Enter Student Id ");
				id=scan.nextInt();
				System.out.println("Enter Name ");
				name=scan.next();
				System.out.println("Enter Contact ");
				contact=scan.next();
				System.out.println("Enter House No.");
	    		String hno = scan.next();
	    		System.out.println("Enter Area");
	    		String area= scan.next();
	    		System.out.println("Enter State");
	    		String state= scan.next();
	    		System.out.println("Enter City");
				String city= scan.next();
				System.out.println("Enter PIN");
				int pin= scan.nextInt();
				add.setHno(hno);
				add.setArea(area);
				add.setCity(city);
				add.setPin(pin);
				add.setState(state);
				sdao.updateStudent(id, name, contact,add);
				break;
			}
			//case 3 for delete records
			case 3: {
				System.out.println("Enter Student Id ");
				id=scan.nextInt();
				sdao.deleteStudent(id);
				System.out.println("Reord deleted successfully...");
				break;
			}
			//case 4 for Retrieve a User
			case 4: {
				 
				System.out.println("Enter Student Id ");
				id=scan.nextInt();
				System.out.println(sdao.getStudent(id));
		        
				break;
			
			}
			//case 5 for showing all records
			case 5: {
				
				System.exit(0);
			}

			}
			//condition for continue
			System.out.println("Do you want to continue: y/n");  
			char c=scan.next().charAt(0);
			if(c=='n')
			break; 
			
		}while(true);
    	sdao.closeSession();
    }
}

        
