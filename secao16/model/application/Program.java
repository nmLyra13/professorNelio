package secao16.model.application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import secao16.model.entities.CarRental;
import secao16.model.entities.Vehicle;
import secao16.model.services.BrazilTaxService;
import secao16.model.services.RentalService;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// Formatting object (Objeto de formatação)  
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		/*
		 * Why save in fmt?
		 * 1. Creating the formatter costs little, but saving it in a variable: 
		 * 2. Avoids repeating code – reuse it in several places. 
		 * 3. Ensures consistency – the entire system writes/reads dates in the same style. 
		 * 4. Eases maintenance – if you change the format, you only change it there.
		 * 
		 * Por que guardar em fmt? 
		 * 1.Criar o formatter custa pouco, mas guardar em uma variável: 
		 * 2.Evita repetir código – reuse em vários lugares. 
		 * 3.Garante consistência – todo o sistema escreve/lê datas no mesmo estilo. 
		 * 4.Facilita manutenção – se mudar o formato, altera só ali.
		 * 
		 */
		
		System.out.println("Entre com os dados do aluguel");
		System.out.print("Modelo do Carro: ");
		String carModel = sc.nextLine();

		System.out.println("Retirada (dd/MM/yyyy hh:mm): ");
		LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);

		System.out.println("Retorno (dd/MM/yyyy hh:mm): ");
		LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);

		CarRental cr = new CarRental(start, finish, new Vehicle(carModel));

		System.out.print("Entre com o preço por hora:");
		double pricePerHour = sc.nextDouble();
		System.out.print("Entre com o preço por dia: ");
		double pricePerDay = sc.nextDouble();

		RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());

		rentalService.processInvoice(cr);

		System.out.println("INVOICE:");
		System.out.println("Basic Payment: " + String.format("%.2f", cr.getInvoice().getBasicPayment()));
		System.out.println("Tax:" + String.format("%.2f", cr.getInvoice().getTax()));
		System.out.println("Total Payment: " + String.format("%.2f", cr.getInvoice().getTotalPayment()));

		sc.close();

	}

}
