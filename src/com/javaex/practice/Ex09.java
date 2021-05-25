package com.javaex.practice;

public class Ex09 {

	public static void main(String[] args) {
		
		double f = 80.0;
		System.out.println(5/9 * (f-32.0)); // 5/9 값은 0이기 때문에 값은 0이 나온다
		
		System.out.println((f-32.0) * 5 / 9); // 26.66666...
		// f = (c*9/5)+32  -->  c = (f-32)*5/9

	}

}
