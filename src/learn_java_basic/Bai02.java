package learn_java_basic;

import java.util.Scanner;

public class Bai02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int cd = scanner.nextInt();
		int cr = scanner.nextInt();
		System.out.println("chu vi: " + (cd + cr) * 2);
		System.out.println("dien tich: " + cd * cr);
		System.out.println("canh nho nhat: " + Math.min(cd, cr));
		scanner.close();
	}
}
