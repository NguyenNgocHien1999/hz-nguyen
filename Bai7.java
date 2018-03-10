package PK;

import java.util.Scanner;

public class Bai7 {
	public static void main(String[] args) {
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert one number: ");
		a = sc.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.print(a+" x "+i+" = ");
			System.out.println(a*i);
		}
	}
}
