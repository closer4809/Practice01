package com.javaex.practice;

public class Ex03 {

	public static void main(String[] args) {
		//�Ʒ��� ��°���� �����Ͽ� �ۼ��ϼ���.
		//(�ڵ带 �ۼ��ؼ� ����� �´��� Ȯ���� ������)
		
		//Ǯ��)
		int x =1;
		int y =1;
		
		int a = ++x *2; //= 4
		int b = y++ *2; //= 4
		
		System.out.println("a=" + a); //4+4 --> 8
		System.out.println("b=" + b); //4+4 --> 8
		System.out.println("x=" + x); //1+1 --> 2
		System.out.println("y=" + y); //1+1 --> 2
		
		//�� ��ư� ��������... ���� ��������
		
		System.out.println("a=" + a); //a=4 
		System.out.println("b=" + b); //b=4 ??????????? 
		System.out.println("x=" + x); //x=2 
		System.out.println("y=" + y); //y=2 
		
	}
}
