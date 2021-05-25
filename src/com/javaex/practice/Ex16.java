package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("상품가격 : ");
		double a = sc.nextDouble();
		
		System.out.print("받은돈 : ");
		double b = sc.nextDouble();
		
		System.out.println("============================");
		
		System.out.println("받은돈 : "+b);
		
		System.out.println("상품가격 : " +a);
		
		System.out.println("부가세 : " +(0.1*a));
		
		System.out.println("잔액 : " +(b-(a*1.1)));
		
		sc.close();
	
	
	}

}
