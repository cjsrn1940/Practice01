package com.javaex.practice;

import java.util.Scanner;

public class Ex15 {
	
	public static void main(String[] args) {
		
		double change = 1.609;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("마일을 입력하세요 : ");
		double mile = sc.nextDouble();
		
		System.out.println(mile + "마일은 " + mile*change + "킬로미터 입니다.");
		
		sc.close();
	}

}
