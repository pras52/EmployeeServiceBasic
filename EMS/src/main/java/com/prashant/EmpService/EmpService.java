package com.prashant.EmpService;

public class EmpService {
	
	
	private String Name;
	private int age;
	
	public EmpService(){}
	public EmpService(String name , int age)
	{
		super();
		this.setAge(age);
		this.setName(name);
		
	}
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

}
