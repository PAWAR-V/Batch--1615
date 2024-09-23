package com.BikkadIT.CrudRepositoryMethods.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.BikkadIT.CrudRepositoryMethods.entity.Student;

public interface StudentServiceI {

	//public Student saveStudent(Student stu);
	
	public List<Student> saveAllStus(List<Student> stus);
	
	public Student getStuById(int sid);
	
	public Student getStuByName(String sname);
	
	public Student getStuBySidAndSrank(int sid,int srank);
	
	public Student getStuBySidOrSrank(int sid,int srank);
	
	public List<Student> getStudentBetween(int srank1,int srank2);
	
	public List<Student> getStudentLessThanId(int sid);
	
	public List<Student> getAllStuHql();
	
	public List<Student> getAllStuSql();
	
	public Student getStuByIdHql(int sid);
	
	public Student getStuByIdSql(int sid);
	
}
