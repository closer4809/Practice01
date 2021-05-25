package com.javaex.practice;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("화씨 : ");
		
		double f= sc.nextDouble();
		double a = (double)5/9*(f-32.0);
		
		
		System.out.println("화씨 "+f+" 의 온도는 "+a+" 입니다." );
	
		sc.close();
	
	
	
	
	}

}
