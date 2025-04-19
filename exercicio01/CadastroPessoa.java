package exercicio01;

import java.util.Locale;
import java.util.Scanner;

public class CadastroPessoa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serão digitadas: ");
		int n = sc.nextInt();

		String[] nome = new String[n];
		int[] idade = new int[n];
		double[] altura = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Informe a pessoa: " + i);
			System.out.print("Nome...: ");
			nome[i] = sc.next();
			System.out.print("Idade..: ");
			idade[i] = sc.nextInt();
			System.out.print("Altura.: ");
			altura[i] = sc.nextDouble();
		}

		double soma = 0.00;
		for (int i = 0; i < n; i++) {
			soma += altura[i];
		}
		double mediaAltura = soma / n;
		System.out.printf("Média das Alturas é: %.2f%n", mediaAltura);

		sc.close();
	}

}
