package AlgorithProgram;

import java.util.ArrayList;

public class primeNumber {
	 //Method to get prime numbers
	private static void getPrime(int min, int max) {
		int flag = 0;
		ArrayList<String> primeNums = new ArrayList<>();

		// Skipping 1 and 0.
		for (int i = min; i <= max; i++) {
			if (i == 1 || i == 0)
				continue;
			flag = 1;

			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					flag = 0;
					break;
				}
			}
			if (flag == 1) {
				System.out.print(i + " ");
				primeNums.add(Integer.toString(i));
			}
		}
	}

	public static void main(String[] args) {
		
		int min = 0;
		int max = 1000;

		System.out.println("Prime numbers between " + min + " and " + max + " are: ");
		getPrime(min, max);

	}

}