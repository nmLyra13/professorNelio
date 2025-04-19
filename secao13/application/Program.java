package secao13.application;

import secao13.entities.Account;
import secao13.entities.BusinessAccount;
import secao13.entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {

		Account acc1 = new Account(1001, "Alex", 1000.00);
		acc1.withdraw(200.0);
		System.out.println(acc1.getBalance());

		Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
		acc2.withdraw(200.0);
		System.out.println(acc2.getBalance());

		Account acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
		acc3.withdraw(200.0);
		System.out.println(acc3.getBalance());

		// BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		// UPCASTING
		// Account acc1 = bacc;
		// Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		// DOWNCASTING
		// Nota importante: Para forçar a conversão da super classe
		// para uma subclasse, precisa fazer casting manual (BusinessAccount)
		// BusinessAccount acc4 = (BusinessAccount) acc2;
	}

}
