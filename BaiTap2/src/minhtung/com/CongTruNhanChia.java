package minhtung.com;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class CongTruNhanChia {
	public static void main(String[] args) {
		NumberFormat numberFormat = new DecimalFormat("#0.00");
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Nhập số a: ");
			double a = sc.nextDouble();
			System.out.print("Nhập số b: ");
			double b = sc.nextDouble();
			System.out.print("Nhập phép tính: ");
			char kt1 = new Scanner(System.in).nextLine().charAt(0);
			switch (kt1) {
			case '+':
				System.out.println(a + " + " + b + " = " + new DecimalFormat("#0.0").format(a+b));
				break;
			case '-':
				System.out.println(a + " - " + b + " = " + numberFormat.format((a - b)));
				break;
			case '*':
				System.out.println(a + " * " + b + " = " + numberFormat.format((a * b)));
				break;
			case '/':
				while (true) {
					if (b == 0) {
						System.out.print("Mẫu = 0 nhập lại: ");
						b = sc.nextDouble();
						continue;
					}
					System.out.println(a + " / " + b + " = " + numberFormat.format((a / b)));
					break;
				}
			}
			System.out.print("Tiếp tục (C) / Thoát (K): ");
			String kt2 = new Scanner(System.in).nextLine();
			if (kt2.equalsIgnoreCase("K")) {
				System.out.println("Chương trình kết thúc");
				break;
			}
		}
	}
}
