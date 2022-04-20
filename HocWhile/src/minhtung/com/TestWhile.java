package minhtung.com;

import java.util.Scanner;

public class TestWhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số cần tính giai thừa: ");
		int num = sc.nextInt();
		int temp = 1;
		int i = 1;
		while (i <= num) {
			temp *= i;
			i++;
		}
		System.out.println("Gia thừa " + num + " = " + temp);
	}
}
