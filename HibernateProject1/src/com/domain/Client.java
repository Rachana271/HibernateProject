package com.domain;


public class Client {
	public static void main(String[] args) 
	{
StudentDaoImpl studentService=new StudentDaoImpl();

Student student1=new Student();

//Insert a student
/*student1.setStdid(103);
student1.setSname("Yogeesh");
studentService.addStudent(student1);*/


//Retrieval operation
student1=studentService.getStudentById(101);
System.out.println(student1);

//update operation
student1.setSname("Helma");
studentService.updateStudent(student1);

//Delete operation
studentService.removeStudent(student1);
}
}
