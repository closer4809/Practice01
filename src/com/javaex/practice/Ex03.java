package com.javaex.practice;

public class Ex03 {

	public static void main(String[] args) {
		//아래의 출력결과를 예상하여 작성하세요.
		//(코드를 작성해서 예상과 맞는지 확인해 보세요)
		
		//풀이)
		int x =1;
		int y =1;
		
		int a = ++x *2; //= 4
		int b = y++ *2; //= 4
		
		System.out.println("a=" + a); //4+4 --> 8
		System.out.println("b=" + b); //4+4 --> 8
		System.out.println("x=" + x); //1+1 --> 2
		System.out.println("y=" + y); //1+1 --> 2
		
		//넘 어렵게 생각했음... 쉽게 생각하자
		
		System.out.println("a=" + a); //a=4 
		System.out.println("b=" + b); //b=4 ??????????? 
		System.out.println("x=" + x); //x=2 
		System.out.println("y=" + y); //y=2 
		
	}
}
