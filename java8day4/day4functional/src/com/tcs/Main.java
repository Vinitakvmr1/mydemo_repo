package com.tcs;

public class Main {

	public static void main(String[] args) {
		StringFunction exclaim = (s) -> s + "!";
		StringFunction ask = (s) -> s + "?";
		FormatString("First String", exclaim);
		FormatString("Second String", ask);
	}

	public static void FormatString(String str, StringFunction format) {
		System.out.println(format.run(str));
	}
}