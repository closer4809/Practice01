package com.javaex.practice;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("ȭ���� �Է����ּ���");
		System.out.print("ȭ�� : ");
		
		double f= sc.nextDouble();
		double a = (double)5/9*(f-32.0);
		
		
		System.out.println("����" +a+ "���Դϴ�." );
	
		sc.close();
	}

}
