package calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter:");
		System.out.println("1:Addition");
		System.out.println("2:Substarction");
		System.out.println("3:multiplication");
		System.out.println("4:divison");

		int num = sc.nextInt();
		System.out.println("Enter 1st number");
		int a = sc.nextInt();
		System.out.println("Enter 2nd number");
		int b = sc.nextInt();

		switch (num) {

		case 1:
			System.out.println(add(a, b));
			break;
		case 2:
			System.out.println(substract(a, b));
			break;
		case 3:
			System.out.println(multiplicaton(a, b));
			break;
		case 4:
			System.out.println(division(a, b));
			break;
		default:
			System.out.println("Enter only int datatype number:");
		}
	}

	public static int add(int n, int m) {
		return n + m;
	}

	public static int substract(int n, int m) {
		return n - m;
	}

	public static int division(int n, int m) {
		return n / m;
	}

	public static int multiplicaton(int n, int m) {
		return n * m;
	}
}
