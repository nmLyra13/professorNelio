package secao16b.application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import javax.swing.text.DateFormatter;

import secao16b.entities.Contract;
import secao16b.entities.Installment;
import secao16b.services.ContractService;
import secao16b.services.PaypalService;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Entre com os dados do Contrato:");
		System.out.print("Número do Contrato:");
		int number = sc.nextInt();
		
		System.out.print("Data (dd/MM/yyyy)");
		LocalDate date = LocalDate.parse(sc.next(), fmt);
		System.out.print("Valor do Contrato: ");
		double totalValue = sc.nextDouble();
		
		Contract  obj = new Contract(number, date, totalValue);
		
		System.out.print("Entre com o número de parcelas: ");
		int n = sc.nextInt();
		
		ContractService contractService = new ContractService(new PaypalService());
		
		contractService.processContract(obj, n);
		
		System.out.println("Parcelas: ");
		
		for (Installment installment : obj.getInstalments()) {
			System.out.println(installment);
		}
		sc.close();
	}
}
