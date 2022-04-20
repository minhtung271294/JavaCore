package minhtung.com;

import java.util.Scanner;

public class TestScanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * System.out.print("Nhập số: "); int a = sc.nextInt();
		 * System.out.println("Số vừa nhập là: " + a);
		 */
		System.out.print("Nhập chuỗi: ");
		String str = sc.nextLine();
		System.out.println("Chuỗi vừa nhập: "+ str);
	}
}
