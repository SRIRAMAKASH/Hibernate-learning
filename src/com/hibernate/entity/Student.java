package com.hibernate.entity;

import javax.persistence.*;

@Entity
@Table(name="student")
public class Student 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column
	private String name;
	@Column
	private String dep;
	@Column
	private int year;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDep() {
		return dep;
	}
	public void setDep(String dep) {
		this.dep = dep;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", dep=" + dep + ", year=" + year + "]";
	}
	public Student(String name, String dep, int year) {
		super();
		this.name = name;
		this.dep = dep;
		this.year = year;
	}
	public Student() {
		super();
	}
	

}
