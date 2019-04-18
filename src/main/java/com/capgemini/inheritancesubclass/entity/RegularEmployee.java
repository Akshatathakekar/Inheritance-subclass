package com.capgemini.inheritancesubclass.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;


@Entity  
@Table(name="regularemployee103")  
@PrimaryKeyJoinColumn(name="ID")  
public class RegularEmployee extends Employee {
	
	@Column(name="salary")
	private float salary;
	
	@Column(name="bonus")
	private int bonus;

	public RegularEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RegularEmployee(int id, String name,float salary, int bonus) {
		super(id,name);
		this.salary = salary;
		this.bonus = bonus;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return "RegularEmployee [salary=" + salary + ", bonus=" + bonus + "]";
	}
	

	
}
