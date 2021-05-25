package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	Scanner sc = new Scanner(System.in);
	
	System.out.print("500원 개수:");
	int a = sc.nextInt();
	
	System.out.print("100원 개수:");
	int b = sc.nextInt();
	
	System.out.print("50원 개수:");
	int c = sc.nextInt();
	
	System.out.print("10원 개수:");
	int d = sc.nextInt();
	
	System.out.println
	("동전의 총합은 " + (a*500+b*100+c*50+d*10) + " 원 입니다.");
	
	
	sc.close();
	
	
	
	}

}
