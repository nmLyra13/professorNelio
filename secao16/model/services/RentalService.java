package secao16.model.services;

import secao16.model.entities.CarRental;
import secao16.model.entities.Invoice;

public class RentalService {

	private Double pricePerHour;
	private Double pricePerDay;

	private BrazilTaxService taxService;

	private RentalService(Double pricePerHour, Double pricePerDay, BrazilTaxService taxService) {
		this.pricePerHour = pricePerDay;
		this.pricePerDay = pricePerDay;
		this.taxService = taxService;
	}

	public void processInvoice(CarRental carRental) {
		carRental.setInvoice(new Invoice(50.0, 10.0));
	}

}
