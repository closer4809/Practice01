package com.javaex.practice;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("È­¾¾¸¦ ÀÔ·ÂÇØÁÖ¼¼¿ä");
		System.out.print("È­¾¾ : ");
		
		double f= sc.nextDouble();
		double a = (double)5/9*(f-32.0);
		
		
		System.out.println("¼·¾¾" +a+ "µµÀÔ´Ï´Ù." );
	
		sc.close();
	}

}
