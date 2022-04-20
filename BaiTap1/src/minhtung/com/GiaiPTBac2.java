package minhtung.com;

import java.util.Scanner;

public class GiaiPTBac2 {
	public static void giaiPTBacHai(double a, double b, double c) {
		double delta;
		delta = (b * b) - (4 * a * c);
		if (delta < 0) {
			System.out.println("delta = " + delta + " nhỏ hơn 0 => PT vô nghiệm");
		} else if (delta == 0) {
			System.out.println("PT có nghiệm kép x1 = x2: " + (-b) / (2 * a));
		} else {
			System.out.println("PT có 2 nghiệm phân biệt x1= " + ((-b) + Math.sqrt(delta)) / (2 * a));
			System.out.println("PT có 2 nghiệm phân biệt x2= " + ((-b) - Math.sqrt(delta)) / (2 * a));
		}
	}

	public static void main(String[] args) {
		double a = 0;
		double b = 0;
		double c = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Giải PT bậc 2");
		do {
			System.out.println("Nghiệm a nhập vào phải khác 0");
			int temp = 0;
			if (temp == 0) {
				System.out.println("Nhập nghiệm a");
				a = sc.nextDouble();
			} else {
				System.out.println("Nghiệm a = 0 nhập lại: ");
			}
		} while (a == 0);

	}

}
