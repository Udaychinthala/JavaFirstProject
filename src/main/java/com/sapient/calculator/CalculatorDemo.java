package com.sapient.calculator;

import java.util.Scanner;

public class CalculatorDemo {

	public static void main(String[] args) {
		
		Calculator c=null;
		
		System.out.println("Enter 2 numbers to  Calculate");
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("Choose the Operation:");
		
		System.out.println("1 addition");
		System.out.println("2 subtraction");
		System.out.println("3 multiplication");
		System.out.println("4 division");
		
		
		int ch = sc.nextInt();
		sc.close();
		
		
		switch (ch) {
		
		case 1:
			c = new AddCalculate();
			break;
		
		case 2:
			c = new SubtractCalculate();
			break;
		
		case 3:
			c = new MultiplyCalculate();
			break;
		
		case 4:
			c = new DivideCalculate();
			break;
		
		default:
			System.out.println("invalid input");
			return;
		}
		System.out.println("result is " + c.calculate(a, b));
	}

}
