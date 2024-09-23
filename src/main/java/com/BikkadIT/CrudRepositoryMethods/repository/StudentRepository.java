package com.BikkadIT.CrudRepositoryMethods.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.BikkadIT.CrudRepositoryMethods.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer>{

	public Student findBySid(int sid);
	
	public Student findBySname(String sname);
	
	public Student findBySidAndSrank(int sid,int srank);
	
	public Student findBySidOrSrank(int sid,int srank);
	
	public List<Student> findBySrankBetween(int srank1,int srank2);
	
	public List<Student> findBySidLessThan(int sid);
	
	@Query("from Student")
	public List<Student> getAllStuHql();
	
	@Query(value="select * from stu_dtls",nativeQuery=true)
	public List<Student> getAllStuSql();
	
	@Query("from Student where sid =:sid")
	public Student getStuHql(int sid);
	
	@Query(value="select * from stu_dtls where stu_id=:sid",nativeQuery= true)
	public Student getStuSql(int sid);
}
