package com.study.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("연산자를 선택하세요.");
		System.out
				.println("더하기: 1 입력, 빼기: 2 입력, 곱하기: 3 입력, 나누기: 4 입력, 16진수로변환: 5 입력");
		System.out.print(">>");

		Scanner scan = new Scanner(System.in);
		String operator = scan.next();

		System.out.println("피연산자를 입력하세요.");

		Calculator cal = new Calculator();

		switch (operator) {

		case "5":
			Scanner scan1 = new Scanner(System.in);

			int num = scan1.nextInt();

			String result1 = new String();
			result1 = cal.toHex(num);
			System.out.println(result1);
			break;

		default:

			Scanner scan2 = new Scanner(System.in);
			int num1 = scan2.nextInt();
			int num2 = scan2.nextInt();

			int result = 0;

			if ("1".equals(operator)) {
				result = cal.add(num1, num2);
				System.out.println(result);
			}

			if ("2".equals(operator)) {
				result = cal.sub(num1, num2);
				System.out.println(result);
			}

			if ("3".equals(operator)) {
				result = cal.mul(num1, num2);
				System.out.println(result);
			}

			if ("4".equals(operator)) {
				result = cal.sub(num1, num2);
				System.out.println(result);
			}

		}

	}

}