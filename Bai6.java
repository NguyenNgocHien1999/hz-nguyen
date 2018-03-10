package PK;

import java.util.Scanner;

public class Bai6 {
	public static void main(String[] args) {
		int a, b, sum, sub, x, div, mod;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input first number: ");
		a = sc.nextInt();
		System.out.println("Input second number: ");
		b = sc.nextInt();
		sum = a + b;
		sub = a - b;
		x  = a * b;
		div = a / b;
		mod = a % b;
		System.out.println(a+" + "+b+" = "+sum);
		System.out.println(a+" - "+b+" = "+sub);
		System.out.println(a+" x "+b+" = "+x);
		System.out.println(a+" / "+b+" = "+div);
		System.out.println(a+" % "+b+" = "+mod);
	}
}
