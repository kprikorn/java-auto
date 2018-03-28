package auto.learn.md;

import java.security.SecureRandom;
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter array length");
		int arr_len = input.nextInt();
		input.close();
		int[] array = new int[arr_len];
		SecureRandom rand = new SecureRandom();

		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(100);
		}

		System.out.println("original array");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();

		for (int i = 0; i < array.length / 2; i++) {
			int temp = array[i];
			array[i] = array[array.length - i - 1];
			array[array.length - i - 1] = temp;

		}
		System.out.println("inversed array");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
