package com.BikkadIT.CrudRepositoryMethods;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.BikkadIT.CrudRepositoryMethods.controller.StudentController;
import com.BikkadIT.CrudRepositoryMethods.entity.Student;

@SpringBootApplication
public class CrudRepositoryMethodsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(CrudRepositoryMethodsApplication.class, args);
		StudentController studentController = run.getBean(StudentController.class);
		Student stu1 = new Student();
		stu1.setSid(1);
		stu1.setSname("vasant");
		stu1.setSaddr("pune");
		stu1.setSrank(1);
		
//		Student stu2 = new Student();
//		stu2.setSid(2);
//		stu2.setSname("vasant");
//		stu2.setSaddr("pune");
//		stu2.setSrank(1);
//		
//		Student stu3 = new Student();
//		stu3.setSid(3);
//		stu3.setSname("vasant");
//		stu3.setSaddr("pune");
//		stu3.setSrank(1);
//		
//		Student stu4 = new Student();
//		stu4.setSid(4);
//		stu4.setSname("vasant");
//		stu4.setSaddr("pune");
//		stu4.setSrank(1);
//		
//		List<Student> list = new ArrayList();
//		list.add(stu4);
//		list.add(stu3);
//		list.add(stu2);
//		list.add(stu1);
//		
//		
//		List<Student> saveAllStus = studentController.saveAllStus(list);
//		System.out.println(saveAllStus);
//		
//		Student studentById = studentController.getStudentById(1);
//		System.out.println(studentById);
//		
//		Student studentBySname = studentController.getStudentBySname("vasant");
//		System.out.println(studentBySname);
		
//		Student stuBySidAndRank = studentController.getStuBySidAndRank(1,1);
//		System.out.println(stuBySidAndRank);
//		
//		Student stuBySidOrRank = studentController.getStuBySidOrRank(1, 5);
//		System.out.println(stuBySidOrRank);
//		
//		List<Student> rankBetween = studentController.getRankBetween(1, 3);
//		System.out.println(rankBetween);
//		
//		List<Student> recordsLessThant = studentController.getRecordsLessThant(5);
//		System.out.println(recordsLessThant);
//		
		
//		List<Student> allStuHql = studentController.getAllStuHql();
//		System.out.println(allStuHql);
//		
//		List<Student> allStuSql = studentController.getAllStuSql();
//		System.out.println(allStuSql);
//		
		Student recordsHql = studentController.getRecordsHql(1);
		System.out.println(recordsHql);
		
		Student recordsSql = studentController.getRecordsSql(2);
		System.out.println(recordsSql);
		
	}

}
