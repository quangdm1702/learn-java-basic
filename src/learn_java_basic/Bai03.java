package learn_java_basic;

import java.util.Scanner;

public class Bai03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap vao canh hinh lap phuong: ");
		int canh = scanner.nextInt();
		System.out.println("The tich hinh lap phuong co canh " + canh + " la: " + Math.pow(canh, 3));
		scanner.close();
	}
}
