package auto.learn.md;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter how many prime numbers you need");
		int num = input.nextInt();
		input.close();
		// getting first prime numbers
		int counter = 0;
		int x = 2;// first prime number to start from

		while (counter < num) {
			int aux = 0;// storing number of successful divisions
			for (int y = 2; y <= x; y++) {
				if (x % y == 0) {
					aux = aux + 1;
				}
			}
			if (aux == 1) {// number is prime if only one division
				System.out.print(x + ", ");
				counter++;// counting how many prime numbers found
			}
			x++;
		}
	}
}
