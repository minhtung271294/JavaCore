package minhtung.com;

import java.util.Scanner;

public class TestFor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số: ");
		int num = sc.nextInt();
		int temp = 1;
		for (int i = 1; i <= num; i++) {
			temp *= i;
		}
		System.out.println("Giai thừa " + num + "=" + temp);
	}
}
