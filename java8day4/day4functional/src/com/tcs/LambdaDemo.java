package com.tcs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LambdaDemo {

	public static void main(String[] args) {
		List<String> cities = new ArrayList<String>();
		cities.add("Chennai");
		cities.add("Mumbai");
		cities.add("Bangalore");
		cities.add("Chennai");
		cities.add("Hyderabad");
		cities.add("Delhi");
		// method 1 : printing the complete arraylist
		System.out.println(cities);

		// method 2 : using enhanced for loop
		System.out.println("Using Enhanced For loop");
		for (String city : cities) {
			System.out.println(city);
		}
		// method 3 : Using normal for loop
		System.out.println("Using normal for loop");
		for (int i = 0; i < cities.size(); i++) {
			System.out.println(cities.get(i));
		}

		// method 4: Using iterator
		System.out.println("Using Iterator");
		Iterator itr = cities.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		//method 5 : Using Lambda
		System.out.println("Using Lambda");
		cities.forEach(c->System.out.println(c));
		
	}

}