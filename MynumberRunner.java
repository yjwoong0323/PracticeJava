package com.inme.loops;

public class MynumberRunner {

	public static void main(String[] args) {
		Mynumber number = new Mynumber(3);

		boolean isPrime = number.isPrime();
		System.out.println("isPrime = " + isPrime);

		int sum = number.sumUptoN();
		System.out.println("sumUptoN is " + sum);

		int sumOfDivisiors = number.sumOfDivisors();
		System.out.println("sumOfDivisors is " + sumOfDivisiors);

		number.printNumberTriangle();
	}

}
