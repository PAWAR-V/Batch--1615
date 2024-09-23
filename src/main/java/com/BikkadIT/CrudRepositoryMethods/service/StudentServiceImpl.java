package com.BikkadIT.CrudRepositoryMethods.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BikkadIT.CrudRepositoryMethods.entity.Student;
import com.BikkadIT.CrudRepositoryMethods.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentServiceI {

	@Autowired
	private StudentRepository studentRepository;
	
	
	
//	@Override
//	public Student saveStudent(Student stu) {
//		Student save = studentRepository.save(stu);
//		return save;
//	}
	

	@Override
	public List<Student> saveAllStus(List<Student> stus) {
		List<Student> saveAll = (List<Student>) studentRepository.saveAll(stus);
		return saveAll;
	}	
	@Override
	public Student getStuById(int sid) {
		Student findBySid = studentRepository.findBySid(sid);
		return findBySid;
	}
	@Override
	public Student getStuByName(String sname) {
		Student bySname = studentRepository.findBySname(sname);
		return bySname;
	}
	@Override
	public Student getStuBySidAndSrank(int sid, int srank) {
		Student bySidAndSrank = studentRepository.findBySidAndSrank(sid, srank);
		return bySidAndSrank;
	}
	@Override
	public Student getStuBySidOrSrank(int sid, int srank) {
		Student bySidOrSrank = studentRepository.findBySidOrSrank(sid, srank);
		return bySidOrSrank;
	}
	@Override
	public List<Student> getStudentBetween(int srank1, int srank2) {
		List<Student> bySrankBetween = studentRepository.findBySrankBetween(srank1, srank2);
		return bySrankBetween;
	}
	@Override
	public List<Student> getStudentLessThanId(int sid) {
		List<Student> bySidLessThan = studentRepository.findBySidLessThan(sid);
		return bySidLessThan;
	}
	@Override
	public List<Student> getAllStuHql() {
		List<Student> allStuHql = studentRepository.getAllStuHql();
		return allStuHql;
	}
	@Override
	public List<Student> getAllStuSql() {
		List<Student> allStuSql = studentRepository.getAllStuSql();
		return allStuSql;
	}
	@Override
	public Student getStuByIdHql(int sid) {
		Student stuHql = studentRepository.getStuHql(sid);
		return stuHql;
	}
	@Override
	public Student getStuByIdSql(int sid) {
		Student allStuSql = studentRepository.getStuSql(sid);
		return allStuSql;
	}
	




	

}
