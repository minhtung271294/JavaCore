package minhtung.com;

public class TestComment {
	/**
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public static double tinhTong(double a, double b) {
		return a + b;
	}

	public static void main(String[] args) {
		// Test commnet
		/*
		 * Test comment
		 */
		/**
		 * Test comment
		 */
		System.out.println("Test commnet");

		System.out.println("Sum: " + tinhTong(1, 2));
	}
}
