package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class CurrencyConverterApp {

	public static double cambio = 3.10;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		System.out.println("What is the dollar price ");
		sc.close();
	}

}
