package com.study.main;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		System.out.println("계산식을 입력하세요.");
		Calculate cal = new Calculate();

		Scanner scan = new Scanner(System.in);

		int num1 = scan.nextInt();
		String operator = scan.next();
		int num2 = scan.nextInt();

		int result = 0;

		if (operator.equals("+")) {
			result = cal.add(num1, num2);
			System.out.println(result);
		}

		if (operator.equals("-")) {
			result = cal.sub(num1, num2);
			System.out.println(result);
		}

		if (operator.equals("*")) {
			result = cal.mul(num1, num2);
			System.out.println(result);
		}

		if (operator.equals("/")) {
			result = cal.sub(num1, num2);
			System.out.println(result);
		}
		

	}
	

}