package exercicio01;

import java.util.Scanner;

public class RectangleApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter the width of the rectangle: ");
		double width = sc.nextDouble();
		System.out.println("--------------------------");
		System.out.println("enter the height of the rectangle: ");
		double height = sc.nextDouble();
		System.out.println("--------------------------");
		System.out.println();
		System.out.println();

		Rectangle rectangle = new Rectangle(width, height);
		// Exibindo os valores para Calculo
		System.out.println("We have: ");
		System.out.println("--------------------------");
		System.out.println("Area......: " + rectangle.calculateArea());
		System.out.println("Perimeter.: " + rectangle.calculatePerimeter());
		System.out.println("Diagonal..: " + rectangle.calculateDiagonal());

		sc.close();
	}
}
