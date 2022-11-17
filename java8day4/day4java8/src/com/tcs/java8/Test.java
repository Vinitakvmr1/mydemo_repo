package com.tcs.java8;

public  class Test implements Vehicle {
	private int id;
	
	//public abstract void show();
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void display() {
		System.out.println("Test [id= "+id+ " mark1= "+mark1 + " mark3=" +mark3+"]");
	}

	public Test() {
		super();
	}


	public Test(int id) {
		super();
		this.id = id;
	}
	
	
}