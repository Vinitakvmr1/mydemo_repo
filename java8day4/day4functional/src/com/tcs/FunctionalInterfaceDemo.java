package com.tcs;

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t1 = new Test();
		t1.show();

		// annonymous inner class
		Interface1 ref1 = new Interface1() {

			@Override
			public void show() {
				// TODO Auto-generated method stub
				System.out.println("This is show method defined in annonymous inner class");
			}
		};

		ref1.show();

		// annonymous inner class
		Interface1 ref2 = new Interface1() {

			@Override
			public void show() {
				// TODO Auto-generated method stub
				System.out.println("This is show method defined in annonymous inner class2");
			}
		};

		ref2.show();

		//lambda or functional expression
		Interface1 ref3 = () -> {
			System.out.println("this is show method defined in lambda");
		};
		
		ref3.show();
		
		Interface2 ref4= n->n*n;
		
		System.out.println("square of 5 is ="+ref4.square(5));
		System.out.println("square of 8 is ="+ref4.square(8));

	}

}