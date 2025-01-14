package Bean_Class;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.* ;


import javax.persistence.*;

@Entity
@Table(name = "student2")
public class Student {
	
	@Id
	private int roll ;
	
	private String name ;
	
	@Column(name = "address")
	 private String add ;
	
	 private int marks ;
	
	

	private String password ;
	
	
	public Student() {
		
	}
	
	public Student(int roll, String name, String add, int marks, String password) {
		super();
		this.roll = roll;
		this.name = name;
		this.add = add;
		this.marks = marks;
		this.password = password;
	}
	
	

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", add=" + add + ", marks=" + marks + ", password="
				+ password + "]";
	}

	
	
	
}
