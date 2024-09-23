package com.BikkadIT.CrudRepositoryMethods.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.BikkadIT.CrudRepositoryMethods.entity.Student;
import com.BikkadIT.CrudRepositoryMethods.service.StudentServiceI;

@Controller
public class StudentController {
	@Autowired
	public StudentServiceI studentServiceI;

	public List<Student> saveAllStus(List<Student> stus){
		List<Student> saveAllStus = studentServiceI.saveAllStus(stus);
		
		return saveAllStus;}
	
	public Student getStudentById(int sid) {
		Student stuById = studentServiceI.getStuById(sid);
		
		return stuById;}
	
	
	public Student getStudentBySname(String sname) {
		Student stuByName = studentServiceI.getStuByName(sname);
		
		return stuByName;}
	
	public Student getStuBySidAndRank(int sid, int srank) {
		Student stuBySidAndSrank = studentServiceI.getStuBySidAndSrank(sid, srank);
		return stuBySidAndSrank;}
	
	public Student getStuBySidOrRank(int sid, int srank) {
		Student stuBySidAndSrank = studentServiceI.getStuBySidOrSrank(sid, srank);
		return stuBySidAndSrank;}
	
	public List<Student> getRankBetween(int srank1,int srank2){
		List<Student> studentBetween = studentServiceI.getStudentBetween(srank1, srank2);
		
		return studentBetween;}
	
	public List<Student> getRecordsLessThant(int sid){
		List<Student> studentLessThanId = studentServiceI.getStudentLessThanId(sid);
		return studentLessThanId;}
	
	
	public List<Student> getAllStuHql(){
		List<Student> allStuHql = studentServiceI.getAllStuHql();
		
		return allStuHql;}
	
	
	public List<Student> getAllStuSql(){
		List<Student> allStuHql = studentServiceI.getAllStuSql();
		
		return allStuHql;}
	
	public Student getRecordsSql(int sid) {
		Student stuByIdSql = studentServiceI.getStuByIdSql(1);
		
		return stuByIdSql;}
	
	public Student getRecordsHql(int sid) {
		Student stuByIdHql = studentServiceI.getStuByIdHql(2);
		
		return stuByIdHql;}
}
