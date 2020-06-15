/**
 * 
 */
package com.prashant.Employee;

/**
 * @author prashant-tiwari
 *
 */
public class Employee {

	private String Name;
	private int age;
	
	public Employee(){}
	public Employee(String name , int age)
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
