package org.campus02.arrays;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class ArrayHelper {
	public static void main(String[] args) {
		int[] lottoTipp = createIntArray(6, 45);
		for (int i = 0; i < lottoTipp.length; i++) {
			System.out.println("Die Nummer an der Stelle " + (i+1) + " lautet: " + lottoTipp[i]);
		}
		System.out.println("Tipp ist " + (validateTipp(lottoTipp) ? "" : "nicht ") + "gueltig");
	}

	public static boolean validateTipp(int[] lottoTipp) {
		Set<Integer> existingNumbers = new HashSet<>();
		for (int n : lottoTipp) {
			if (existingNumbers.contains(n))
				return false;
			existingNumbers.add(n);
		}
		return true;
	}

	public static int[] createIntArray(int sizeOfArray, int maxValue) {
		Random rand = new Random();
		int[] randomNumberArray = new int[sizeOfArray];
		for (int i = 0; i < sizeOfArray; i++) {
			randomNumberArray[i] = rand.nextInt(1, maxValue + 1);
		}
		return randomNumberArray;
	}
}
