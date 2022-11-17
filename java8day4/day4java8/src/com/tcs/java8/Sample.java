package com.tcs.java8;

import java.io.Serializable;

public class Sample implements Serializable{
	private int id;

	@Override
	public String toString() {
		return "Sample [id=" + id + "]";
	}
	
	

}