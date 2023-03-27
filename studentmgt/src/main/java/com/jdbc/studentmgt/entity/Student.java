package com.jdbc.studentmgt.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name="Stu")
public class Student 
{
@Id
//@GeneratedValue
  private int sid;
  private String sname;
  private String contact;
  @OneToOne(cascade = CascadeType.ALL)
  private Address address;
  
  public Student() {
		super();
	}
  public Student(int sid, String sname, String contact,Address address) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.contact = contact;
		this.address= address;
	}
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public String getContact() {
	return contact;
}
public void setContact(String contact) {
	this.contact = contact;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
@Override
public String toString() {
	return "Student [sid=" + sid + ", sname=" + sname + ", contact=" + contact + ", address=" + address + "]";
} 
  
}