package com.ass.data.entity;

import java.io.Serializable;



public class DataEntity 
{
	private int id;
	private String value;
	
	
	
	
	public DataEntity() {
		super();
		// TODO Auto-generated constructor stub
	}




	public DataEntity(int id, String value) {
		super();
		this.id = id;
		this.value = value;
	}




	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getValue() {
		return value;
	}




	public void setValue(String value) {
		this.value = value;
	}
	
	
	
	

}
