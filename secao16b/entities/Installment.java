package secao16b.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

// Installment = parcela
public class Installment {

	private DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	private LocalDate date;
	private Double amount;

	public Installment() {
	}
	public Installment(LocalDate date, Double amount) {
		this.date = date;
		this.amount = amount;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return date.format(fmt) 
				+ " - " 
				+ String.format("%.2f", amount);
	}
}
