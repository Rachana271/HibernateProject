package com.domain;
public class StudentServiceImpl implements StudentService{

	private StudentDao studentdao;
	
	public StudentServiceImpl() {
		
	}

	@Override
	public Student findStudentById(int id) {
		
		Student student =studentdao.getStudentById(id);
		return student;
	}

	@Override
	public void addStudent(Student student) {
		studentdao.beginTransaction();
		studentdao.addStudent(student);
		studentdao.commitTransaction();	
	}

	@Override
	public void removeStudent(Student student) {
		studentdao.beginTransaction();
		studentdao.removeStudent(student);
		studentdao.commitTransaction();	
	}

	@Override
	public void updateStudent(Student student) {
		studentdao.beginTransaction();
		studentdao.updateStudent(student);
		studentdao.commitTransaction();	
	}

}
