package exercicio01;

public class Rectangle {

	private double width;
	private double height;

	// Construtor
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	// Método para calcular area
	public double calculateArea() {
		return width * height;
	}

	// Método para calcular perimetro
	public double calculatePerimeter() {
		return 2 * (width + height);
	}

	// Método para calcular diagonal
	public double calculateDiagonal() {
		return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
	}

}
