package secao16.model.services;

import java.time.Duration;

import secao16.model.entities.CarRental;
import secao16.model.entities.Invoice;

public class RentalService {

	private Double pricePerHour;
	private Double pricePerDay;

	private TaxService taxService;

	/*
	 * We will not create a default constructor, so you will be required to inform
	 * pricePerHour, pricePerDay and taxService when instantiating RentalService.
	 *
	 * Não vamos criar construtor padrão, assim será obrigado a informar
	 * pricePerHour, pricePerDay e taxService no momento de instanciar
	 * RentalService.
	 * 
	 */
	
	// Constructor with arguments (Construtor com argumentos)
	public RentalService(Double pricePerHour, Double pricePerDay, TaxService taxService) {
		this.pricePerHour = pricePerHour;
		this.pricePerDay = pricePerDay;
		this.taxService = taxService;
	}

	public void processInvoice(CarRental carRental) {

		double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
		double hours = minutes / 60.0;

		double basicPayment;

		if (hours <= 12.0) {
			// Função Math.ceil - Arredonda para cima.
			basicPayment = pricePerHour * Math.ceil(hours);
		} else {
			basicPayment = pricePerDay * Math.ceil(hours / 24.0);
		}

		double tax = taxService.tax(basicPayment);

		carRental.setInvoice(new Invoice(basicPayment, tax));
	}

}
