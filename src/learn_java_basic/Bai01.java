package learn_java_basic;

import java.util.Scanner;

public class Bai01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		double diem = scanner.nextDouble();
		System.out.println(name + " " + diem);
		scanner.close();
	}
}
