package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc = new Scanner(System.in);
	
	System.out.print("가로를 입력하세요 : ");
	double a = sc.nextDouble();
	
	System.out.print("세로를 입력하세요 : ");
	double b = sc.nextDouble();
	
	
			
			
	System.out.println("사각형의 넓이는 "+ a*b);
	System.out.println("사각형의 둘레는 " +2*(a+b));
	
	sc.close();
	
	}

}
