package PK;

import java.util.Scanner;

public class Bai12 {
	public static void main(String[] args) {
		int num1, num2, num3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert first number: ");
		num1 = sc.nextInt();
		System.out.println("Insert second number: ");
		num2 = sc.nextInt();
		System.out.println("Insert three number: ");
		num3 = sc.nextInt();
		System.out.println("Average of 3 numbers is: "+(num1 + num2 + num3) * 1.0 / 3);
	}
}
