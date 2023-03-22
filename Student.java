package org.student;
import org.department.*;
public class Student extends Department{
	public void studentName()
	{
		System.out.println("Student name is Hema");
	}
	public void studentDept()
	{
		System.out.println("Computer science department");
	}
	public void studentId()
	{
		System.out.println("Student Id is 0254");
	}
	public static void main(String[] args) {
		Student std=new Student();
		std.collegeName();
		std.collegeCode();
		std.collegeRank();
		std.departmentName();
		std.studentName();
		std.studentId();
		std.studentDept();
		

	}

}
