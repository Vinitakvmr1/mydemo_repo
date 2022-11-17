package com.tcs.java8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Starter {

	public static void main(String[] args) throws Exception {
		MyClass obj = new MyClass();
		obj.display();

		Test obj1 = new Test();
		obj1.setId(100);
		Vehicle obj2 = new Vehicle() {
		};
		
		obj1.display();
		obj1.setId(200);
		obj1.display();
		
		Sample s1= new Sample();
		
		//serialization code
		File f = new File("c:\\demo.txt");
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s1);
		oos.close();
		fos.close();
		
		//deserialization code
		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Sample s2 = (Sample) ois.readObject();
		System.out.println(s2);
		ois.close();
		fis.close();
	
		
	}

}