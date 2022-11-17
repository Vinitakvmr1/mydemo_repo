package com.tcs.java8;

import java.io.Serializable;

public interface MyInterface extends Vehicle, Serializable {
	// All properties are public, static & final
	float FI = 3.14f;

	// all methods are public & abstract
	void display();

}