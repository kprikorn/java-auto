package auto.learn.md;

import java.security.SecureRandom;
import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter array A length");
		int arrayA_len = input.nextInt();
		int[] arrayA = new int[arrayA_len];
		SecureRandom randA = new SecureRandom();
		for (int i = 0; i < arrayA.length; i++) {
			arrayA[i] = randA.nextInt(100);
		}
		// sorting arrayA
		for (int i = 0; i < arrayA.length; i++) {
			for (int j = 0; j < arrayA.length; j++) {
				if (arrayA[i] > arrayA[j]) {
					int temp = arrayA[i];
					arrayA[i] = arrayA[j];
					arrayA[j] = temp;
				}
			}
		}
		// display arrayA
		for (int i = 0; i < arrayA.length; i++) {
			System.out.print(arrayA[i] + " ");
		}
		System.out.println();

		System.out.println("Enter array B length");
		int arrayB_len = input.nextInt();
		int[] arrayB = new int[arrayB_len];
		SecureRandom randB = new SecureRandom();
		for (int i = 0; i < arrayB.length; i++) {
			arrayB[i] = randB.nextInt(100);
		}
		input.close();
		// sorting arrayB
		for (int i = 0; i < arrayB.length; i++) {
			for (int j = 0; j < arrayB.length; j++) {
				if (arrayB[i] > arrayB[j]) {
					int temp = arrayB[i];
					arrayB[i] = arrayB[j];
					arrayB[j] = temp;
				}
			}
		}
		// display arrayB
		for (int i = 0; i < arrayB.length; i++) {
			System.out.print(arrayB[i] + " ");
		}
		System.out.println();
		// create array from 2 sorted

		int[] arrayC = new int[arrayA_len + arrayB_len];
		arrayC = merge(arrayA, arrayB);
		// display arrayC
		for (int i = 0; i < arrayC.length; i++) {
			System.out.print(arrayC[i] + " ");
		}
	}

	public static int[] merge(int[] a, int[] b) {

		int[] answer = new int[a.length + b.length];
		int i = 0, j = 0, k = 0;
		while (i < a.length && j < b.length) {
			if (a[i] < b[j]) {
				answer[k] = a[i];
				i++;
			} else {
				answer[k] = b[j];
				j++;
			}
			k++;
		}

		while (i < a.length) {
			answer[k] = a[i];
			i++;
			k++;
		}

		while (j < b.length) {
			answer[k] = b[j];
			j++;
			k++;
		}
		return answer;
	}

}
