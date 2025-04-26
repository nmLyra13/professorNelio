package secao16b.application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		
		System.out.println("Entre com os dados do Contrato:");
		System.out.print("Número do Contrato:");
		int number = sc.nextInt();
		System.out.print("Data (dd/MM/yyyy)");

		
		
		sc.close();
	}

}
