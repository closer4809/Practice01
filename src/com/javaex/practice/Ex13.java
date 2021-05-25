package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc = new Scanner(System.in);
	
	System.out.print("환전할 원화를 입력하세요 : ");
	float money = sc.nextFloat();
	
	System.out.println("받으실 달러는"+ money/1230.95);
	
	sc.close();
	}

}
