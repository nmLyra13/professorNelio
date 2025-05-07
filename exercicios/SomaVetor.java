package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetor {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos números voce vai digitar? ");
		int n = sc.nextInt();
		double vet[] = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Digite um número: ");
			vet[i] = sc.nextDouble();
		}

		System.out.println("NÚMEROS NEGATIVOS");
		for (int i = 0; i < n; i++) {
			if (vet[i] < 0) {
				System.out.print(vet[i]);

			}

			sc.close();
		}
	}
}
