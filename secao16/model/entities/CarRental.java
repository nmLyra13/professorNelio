package secao16.model.entities;

import java.time.LocalDateTime;

// Car rental class
public class CarRental {

	// Start and end of rental.
	private LocalDateTime start;
	private LocalDateTime finish;

	/*
	 * --- Pay attention to the composition --- 
	 * CarRental is associated with the
	 * Vehicle class and associated with the Invoice class.
	 * 
	 * --- Preste atenção à composição --- 
	 * AluguelDeCarro está associado à classe
	 * Veículo e à classe Nota Fiscal.
	 */

	private Vehicle vehicle;
	private Invoice invoice;

	/*
	 * Default constructor (Construtor padrão)
	 */
	public CarRental() {
	}

	/*
	 * constructor with argument (Construtor com argumento)
	 */
	public CarRental(LocalDateTime start, LocalDateTime finish, Vehicle vehicle) {
		this.start = start;
		this.finish = finish;
		this.vehicle = vehicle;
	}

	public LocalDateTime getStart() {
		return start;
	}

	public void setStart(LocalDateTime start) {
		this.start = start;
	}

	public LocalDateTime getFinish() {
		return finish;
	}

	public void setFinish(LocalDateTime finish) {
		this.finish = finish;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}

}
