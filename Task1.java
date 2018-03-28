package auto.learn.md;

import java.security.SecureRandom;

public class Task1 {

	public static void main(String[] args) {
		double start = 10;
		double end = 21;
		SecureRandom rand = new SecureRandom();
		for (int i = 0; i < 50; i++) {
			double x = rand.nextDouble();
			double res = start + (x * (end - start));
			System.out.printf("%.6f | %.0f %n", x, res);
		}
	}
}
