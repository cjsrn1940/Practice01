package com.javaex.practice;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("화씨 : ");
		double Fahrenheit = sc.nextDouble();
		
		double Celsius = (Fahrenheit-32.0) * 5 / 9;
		
		System.out.println("화씨 " + Fahrenheit + " 의 섭씨온도는" + Celsius + " 입니다.");
		
		sc.close();

	}

}
