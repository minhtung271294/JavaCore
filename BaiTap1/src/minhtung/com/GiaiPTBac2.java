package minhtung.com;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class GiaiPTBac2 {
	public static void giaiPTBacHai(double a, double b, double c) {
		NumberFormat numberFormat = new DecimalFormat("#0.00");
		double delta;
		delta = (b * b) - (4 * a * c);
		if (delta < 0) {
			System.out.println("delta = " + delta + " nhỏ hơn 0 => PT vô nghiệm");
		} else if (delta == 0) {
			System.out.println("PT có nghiệm kép x1 = x2: " + numberFormat.format((-b) / (2 * a)));
		} else {
			System.out.println(
					"PT có 2 nghiệm phân biệt x1= " + numberFormat.format(((-b) + Math.sqrt(delta)) / (2 * a)));
			System.out.println(
					"PT có 2 nghiệm phân biệt x2= " + numberFormat.format(((-b) - Math.sqrt(delta)) / (2 * a)));
		}
	}

	public static void main(String[] args) {
		double a = 0, b = 0, c = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Giải PT bậc 2");
		do {
			System.out.println("Nghiệm a nhập vào phải khác 0");
			int temp = 0;
			if (temp == 0) {
				System.out.print("Nhập nghiệm a: ");
				a = sc.nextDouble();
			} else {
				System.out.println("Nghiệm a = 0 nhập lại: ");
			}
		} while (a == 0);
		System.out.print("Nhập nghiệm b: ");
		b = sc.nextDouble();
		System.out.print("Nhập nghiệm c: ");
		c = sc.nextDouble();
		giaiPTBacHai(a, b, c);
	}

}
