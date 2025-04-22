package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class SalaryApp {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Salary salary = new Salary();

		System.out.println("Name: ");
		salary.name = sc.next();
		System.out.println("Gross Salary: ");
		salary.grossSalary = sc.nextDouble();
		System.out.println("Tax: ");
		salary.tax = sc.nextDouble();

		System.out.println();
		System.out.println("Employee: " + salary);
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		salary.increaseSalary(percentage);

		System.out.println();
		System.out.println("Updated data: " + salary);

		sc.close();
	}

}
