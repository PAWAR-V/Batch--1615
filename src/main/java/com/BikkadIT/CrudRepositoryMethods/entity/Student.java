package com.BikkadIT.CrudRepositoryMethods.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Stu_dtls")
public class Student {
	@Id
	@Column(name="Stu_id")
	private int sid;
	
	@Column(name="Stu_sname")
	private String sname;
	
	@Column(name="Stu_saddr")
	private String saddr;
	
	@Column(name="Stu_srank")
	private int srank;
	
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSaddr() {
		return saddr;
	}
	public void setSaddr(String saddr) {
		this.saddr = saddr;
	}
	public int getSrank() {
		return srank;
	}
	public void setSrank(int srank) {
		this.srank = srank;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", saddr=" + saddr + ", srank=" + srank + "]";
	}
	
	
}
