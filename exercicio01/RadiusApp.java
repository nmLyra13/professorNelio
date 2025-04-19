package exercicio01;

import java.util.Locale;
import java.util.Scanner;

public class RadiusApp {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter radius: ");
		double radius = sc.nextDouble();

		double c = RadiusCalculator.circumferemce(radius);

		double v = RadiusCalculator.volume(radius);

		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("Pi: %.2f%n", RadiusCalculator.PI);

		sc.close();

	}

}
