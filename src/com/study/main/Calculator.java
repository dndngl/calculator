package com.study.main;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		System.out.println("연산자를 선택하세요.");
		System.out.println("더하기: 1 입력, 빼기: 2 입력, 곱하기: 3 입력, 나누기: 4 입력, 16진수로변환: 5 입력");
		System.out.print(">>");

		Scanner scan = new Scanner(System.in);
		String operator = scan.next();
		
		System.out.println("피연산자를 입력하세요.");
		
		Calculate cal = new Calculate();

		

		int result = 0;

		if (operator.equals("1")) {
			result = cal.add();
			System.out.println(result);
		}

		if (operator.equals("2")) {
			result = cal.sub();
			System.out.println(result);
		}

		if (operator.equals("3")) {
			result = cal.mul();
			System.out.println(result);
		}

		if (operator.equals("4")) {
			result = cal.sub();
			System.out.println(result);
		}
		
		if (operator.equals("5")) {
			String result1 = new String();
			result1 = cal.toHex();
			System.out.println(result1);
		}
		

	}
	

}