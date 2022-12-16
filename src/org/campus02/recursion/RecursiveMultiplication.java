package org.campus02.recursion;

public class RecursiveMultiplication {
	public static void main(String[] args) {
		final int NUMBER = 5;
		int[] testData = new int[]{ 0, 1, 2, 5, 40, -10, -1, -2 };
		for (int factor : testData) {
			System.out.println(NUMBER + " x " + factor + " = " + multiplicate(NUMBER, factor));
			System.out.println(factor + " x " + NUMBER + " = " + multiplicate(factor, NUMBER));
		}
	}
	public static int multiplicate(int a, int b) {
		if (b == 0)
			return 0;
		if (b < 0)
			return multiplicate(a, b * (-1)) * (-1);
		return a + multiplicate(a, b - 1);
	}
}
