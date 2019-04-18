package com.capgemini.inheritancesubclass.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity  
@Table(name="contractemployee103")  
@PrimaryKeyJoinColumn(name="ID")  

public class ContractEmployee extends Employee {

	@Column(name="Pay_per_Hour")
	private float payHour;
	
	@Column(name="duration")
	private float duration;

	public ContractEmployee(int id, String name,float payHour, float duration) {
		super(id,name);
		this.payHour = payHour;
		this.duration = duration;
	}

	public ContractEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public float getPayHour() {
		return payHour;
	}

	public void setPayHour(float payHour) {
		this.payHour = payHour;
	}

	public float getDuration() {
		return duration;
	}

	public void setDuration(float duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "ContractEmployee [payHour=" + payHour + ", duration=" + duration + "]";
	}
	
	
}
