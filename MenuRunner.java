package com.inme.ifstatement.examples;

import java.util.Scanner;

public class MenuRunner {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter Number1: ");
		int number1 = scanner.nextInt();

		System.out.print("Enter Number2: ");
		int number2 = scanner.nextInt();

		System.out.println("Choices Availavle are");
		System.out.println("1 - Add");
		System.out.println("2 - Substract");
		System.out.println("3 - Divide");
		System.out.println("4 - Multiply");

		System.out.print("Select one menu");
		int option = scanner.nextInt();

		System.out.println("Your Choices are");
		System.out.println("Number1 = " + number1);
		System.out.println("Number2 = " + number2);
		System.out.println("Option is " + option);

		performOperationUsingSwitch(number1, number2, option);
	}

	private static void performOperationUsingNestedIfElse(int number1, int number2, int option) {
		if (option == 1) {
			System.out.println(number1 + number2);
		} else if (option == 2) {
			if (number1 >= number2) {
				System.out.println(number1 - number2);
			} else {
				System.out.println(number2 - number1);
				;
			}
		} else if (option == 3) {
			if (number1 >= number2) {
				System.out.println(number1 / number2);
				;
			} else {
				System.out.println(number2 / number1);
			}
		} else if (option == 4) {
			System.out.println(number1 * number2);
		} else {
			System.out.println("Invalid Operation");
		}
	}

	private static void performOperationUsingSwitch(int number1, int number2, int option) {
		switch (option) {
		case 1:
			System.out.println(number1 + number2);
			break;
		case 2:
			System.out.println(number1 - number2);
			break;
		case 3:
			System.out.println(number1 / number2);
			break;
		case 4:
			System.out.println(number1 * number2);
			break;
		default:
			System.out.println("Invalid Operation");
		}
	}
}
