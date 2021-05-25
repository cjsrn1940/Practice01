package com.javaex.practice;

public class Ex06 {

	public static void main(String[] args) {
		
		int i = 10;
		int n = i++ % 2; // i%2 먼저 실행 후 i값에 1을 더해 저장
		
		System.out.println(i); // 11
		System.out.println(n); // 0

	}

}
