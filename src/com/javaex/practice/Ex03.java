package com.javaex.practice;

public class Ex03 {

	public static void main(String[] args) {
		int x = 1;
		int y = 1;
		
		int a = ++x * 2; // ++x(x=2) 실행 후 *2  -->  4
		int b = y++ * 2; // *2 실행 후 y++(y=2)  -->  2
		
		System.out.println("a = " + a); // 4
		System.out.println("b = " + b); // 2
		System.out.println("x = " + x); // 2
		System.out.println("y = " + y); // 2
	}
}
