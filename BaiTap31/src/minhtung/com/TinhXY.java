package minhtung.com;

import java.util.Scanner;

public class TinhXY {
	public static double tinhTongXY(double n, double x) {
		double s = 0;
		double mau = 0;
		for (int i = 1; i <= n; i++) {
			double tu = Math.pow(x, i);
			for (int j = 1; j <= i; j++) {
				mau = mau + j;
			}
			s = tu / mau;
		}
		return s;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập x: ");
		double x = sc.nextDouble();
		System.out.println("Nhập y: ");
		double y = sc.nextDouble();
		double s = 0;
		System.out.println(s = tinhTongXY(x, y));
	}

}
