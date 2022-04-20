package minhtung.com;

import java.util.Scanner;

public class TestContinue {
	public static void main(String[] args) {
		System.out.print("Nhập độ lớn dãy số int ra các số lẻ: ");
		int num = new Scanner(System.in).nextInt();
		for (int i = 0; i <= num; i++) {
			if (i % 2 == 0) {
				continue;
			}
			System.out.print(i + " ");
		}
	}
}
