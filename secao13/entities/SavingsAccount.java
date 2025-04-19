package secao13.entities;

public class SavingsAccount extends Account {

	public Double interestRate;

	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance); // argumentos da classe Account
		this.interestRate = interestRate; // argumento desta classe.
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}

	public void updateBalance() {
		balance += balance + interestRate; // taxa de juros
	}

	@Override
	public void withdraw(double amount) {
		balance -= amount;
	}

}
