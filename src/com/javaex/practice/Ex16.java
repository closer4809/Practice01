package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("��ǰ���� : ");
		double a = sc.nextDouble();
		
		System.out.print("������ : ");
		double b = sc.nextDouble();
		
		System.out.println("============================");
		
		System.out.println("������ : "+b);
		
		System.out.println("��ǰ���� : " +a);
		
		System.out.println("�ΰ��� : " +(0.1*a));
		
		System.out.println("�ܾ� : " +(b-(a*1.1)));
		
		sc.close();
	
	
	}

}
