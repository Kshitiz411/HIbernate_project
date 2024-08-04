package com.hibernate.Mapping;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class student {
	
	@Id
	private int id;
	private String name;
	private String address;
	
	private Certificate certi;

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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Certificate getCerti() {
		return certi;
	}

	public void setCerti(Certificate certi) {
		this.certi = certi;
	}

	public student(int id, String name, String address, Certificate certi) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.certi = certi;
	}

	public student() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
	
	
	

}
