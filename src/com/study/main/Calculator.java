package com.study.main;

import java.util.Scanner;

public class Calculator {

	

	static int result;

	public int add(int num1,int num2) {

		
		result = num1 + num2;
		return result;
	}

	public int sub(int num1,int num2) {

		result = num1 - num2;
		return result;
	}

	public int mul(int num1,int num2) {

		result = num1 * num2;
		return result;
	}

	public int div(int num1,int num2) {

		result = num1 - num2;
		return result;
	}

	public String toHex(int decNumber) {


		char tempHexNumber[] = new char[50];
		int qoutient = 1;
		char remainder[] = new char[50];
		int i = 0;
		int j = 0;

		for(;qoutient > 0;i++) {
			qoutient = decNumber / 16;
			remainder[i] =  Character.forDigit(decNumber % 16, 10);

			switch (remainder[i]) {

			case 10 : 
				remainder[i] = 'A'; 
				break;
			case 11:
				remainder[i] = 'B';
				break;
			case 12:
				remainder[i] = 'C';
				break;
			case 13:
				remainder[i] = 'D';
				break;
			case 14:
				remainder[i] = 'E';
				break;
			case 15:
				remainder[i] = 'F';
				break;
			default:
				break;
			}
			
			decNumber=qoutient;

		}

		i = i - 1;

		while (i >= 0) {
			tempHexNumber[j] = remainder[i];
			i--;
			j++;
		}

		String hexNumber = new String(tempHexNumber, 0, tempHexNumber.length);

		return hexNumber;

	}

}
