package com.javaex.practice;

public class Ex07 {

	public static void main(String[] args) {
		
		int i = 10;
		int n = ++i % 2; // i 값에 1을 먼저 더한 후 새롭게 저장된 i에 %2
		
		System.out.println(i); // 11
		System.out.println(n); // 1
		
		//Ex06은 i++ 명령을 그 줄의 다른 걸 실행한 뒤에 한 것이고, Ex07은 ++i을 보다 먼저 수행한 차이점이 있다

	}

}
