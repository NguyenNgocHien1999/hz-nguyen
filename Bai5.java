package PK;

import java.util.Scanner;

public class Bai5 {
	public static void main(String[] args) {
		int a, b, x;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input first number: ");
		a = sc.nextInt();
		System.out.println("Input second number: ");
		b = sc.nextInt();
		x  = a * b;
		System.out.println(a+" x "+b+" = "+x);
	}
}
