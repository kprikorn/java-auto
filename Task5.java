package auto.learn.md;

public class Task5 {

	public static void main(String[] args) {
		int num = 3;
		int perm = 1;

		for (int i = 1; i <= num; i++) {
			perm = perm * i;
		}
		System.out.printf("there are %d permutations %n", perm);

		for (int i = 1; i <= perm; i++) {
			System.out.println(i + " " + (i + 1) + " " + (i + 2));
			System.out.println(i + " " + (i + 2) + " " + (i + 1));
		}
	}
}
