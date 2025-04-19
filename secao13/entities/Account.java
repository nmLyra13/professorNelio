package secao13.entities;

public class Account {

	private Integer number;
	private String holder;
	protected Double balance;

	public Account() {
	}

	public Account(Integer number, String holder, Double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}

	// getters
	public Integer getNumber() {
		return number;
	}

	// setters
	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	// SetBalance não pode ser usada, não podemos
	// mudar o saldo da conta.
	// public void setBalance(Double balance) {
	// this.balance = balance;
	// }

	// Aqui implementamos deposito
	public void withdraw(double amount) {
		balance -= amount + 5.0;
	}

	public void deposit(double amount) {
		balance += amount;
	}

}
