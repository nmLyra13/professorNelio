package secao16.model.entities;

// Classe Veículo
public class Vehicle {

	private String model;

	// Construtor padrão
	public Vehicle() {

	}

	// Construtor com argumento
	public Vehicle(String model) {
		this.model = model;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
}
