package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ArrayProgram {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		double[] vect = new double[n];

		for (int i = 0; i < 3; i++) {
			vect[i] = sc.nextDouble();
		}
		double sum = 0.00;
		for (int i = 0; i < n; i++) {
			sum += vect[i];
		}
		double avg = sum / n;
		System.out.printf("Average Height: %.2f%n", avg);
		sc.close();
	}
}
