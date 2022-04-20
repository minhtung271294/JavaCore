package minhtung.com;

import java.util.Scanner;

public class TestSwith {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập tháng");
		int num = sc.nextInt();
		switch (num) {
		case 1:
			System.out.println("Tháng" + num + " có 31 ngày");
			break;
		case 2:
			System.out.println("Tháng" + num + " có 28 hoặc 29 ngày");
			break;
		case 3:
			System.out.println("Tháng" + num + " có 31 ngày");
			break;
		case 4:
			System.out.println("Tháng" + num + " có 30 ngày");
			break;
		case 5:
			System.out.println("Tháng" + num + " có 31 ngày");
			break;
		case 6:
			System.out.println("Tháng" + num + " có 30 ngày");
			break;
		case 7:
			System.out.println("Tháng" + num + " có 31 ngày");
			break;
		case 8:
			System.out.println("Tháng" + num + " có 30 ngày");
			break;
		case 9:
			System.out.println("Tháng" + num + " có 31 ngày");
			break;
		case 10:
			System.out.println("Tháng" + num + " có 30 ngày");
			break;
		case 11:
			System.out.println("Tháng" + num + " có 31 ngày");
			break;
		case 12:
			System.out.println("Tháng" + num + " có 30 ngày");
			break;
		default:
			System.err.println("Tháng nhập vào phải nhỏ hơn 12");
			break;
		}
	}

}
