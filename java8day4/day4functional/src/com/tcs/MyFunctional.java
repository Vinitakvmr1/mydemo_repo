package com.tcs;

@FunctionalInterface
public interface MyFunctional {

	// It's a abstract method
	public void display();

	// It's a empty default method
	public default void show() {
		System.out.println("This is show method");
	}

	public default void add() {
		System.out.println("this is add method");
	}

	public static void print() {
		System.out.println("This is static Print method");
	}

	public static void output() {
		System.out.println(" This is static output method");
	}
}