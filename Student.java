package org.student;

import org.college.College;

public class Student extends College{
	public void studentname() {
		System.out.println("student name : Dhivya");
	}
	public void studentdepartment() {
		System.out.println("student department : Metallurgy");
	}
	public void studentid() {
		System.out.println("student id : 147");
	}
public static void main(String[] args) {
	Student st = new Student();
	st.Collegename();
	st.collegecode();
	st.collegerank();
	st.deptname();
	st.studentname();
	st.studentdepartment();
	st.studentid();
	
	
}
}
