package exercicios;

public class RadiusCalculator {

	public static final double PI = 3.14;

	public static double circumferemce(double radius) {
		return 2.0 * PI * radius;
	}

	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}
}
