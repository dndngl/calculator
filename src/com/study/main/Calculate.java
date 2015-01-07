package com.study.main;

import java.util.Scanner;

public class Calculate {

	Scanner scan = new Scanner(System.in);

	static int result;

	public int add() {

		int num1 = scan.nextInt();
		int num2 = scan.nextInt();

		result = num1 + num2;
		return result;
	}

	public int sub() {

		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		result = num1 - num2;
		return result;
	}

	public int mul() {

		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		result = num1 * num2;
		return result;
	}

	public int div() {

		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		result = num1 - num2;
		return result;
	}

	public String toHex() {

		int decNumber = scan.nextInt();

		char tempHexNumber[] = new char[20];
		char remainder1[] = new char[20];
		int qoutient = 1;
		char remainder;
		int i = 0;
		int j = 0;

		while (qoutient > 0) {
			qoutient = decNumber / 16;
			remainder = (char) (decNumber - 16 * qoutient);

			switch (remainder) {

			case 10:
				remainder1[i] = 'A';
				break;
			case 11:
				remainder1[i] = 'B';
				break;
			case 12:
				remainder1[i] = 'C';
				break;
			case 13:
				remainder1[i] = 'D';
				break;
			case 14:
				remainder1[i] = 'E';
				break;
			case 15:
				remainder1[i] = 'F';
				break;
			default:
				break;
			}

			i++;
		}

		i = i - 1;

		while (i >= 0) {
			tempHexNumber[j] = remainder1[i];
			i--;
			j++;
		}

		String hexNumber = new String(tempHexNumber, 0, tempHexNumber.length);

		return hexNumber;

	}

}
