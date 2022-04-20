package minhtung.com;

import java.util.Scanner;

public class TestBreak {
	public static void main(String[] args) {
		while (true) {
			System.out.println("Nhập vào số: ");
			int num = new Scanner(System.in).nextInt();
			if (num % 2 == 0) {
				System.out.println(num + " là số chẵn");
			} else {
				System.out.println(num + "là số lẻ");
			}
			System.out.println("Chọn y/n tiếp tục hoặc thoát");
			String kt = new Scanner(System.in).nextLine();
			if (kt.equalsIgnoreCase("n")) {
				break;
			}
			System.out.println("See you again");
		}
	}
}
