package ClassNInterface;

public class CarMethod {
	String make;
	String model;
	int year;
	int lastServiced;
	public CarMethod( String make, String model, int year){
		this.make = make;
		this.model = model;
		this.year = year;
	}
	// Getter
	public int ServiceDate() {
		return lastServiced;
	}

	// Setter
	public void setServiceDate(int newService) {
		this.lastServiced = newService;
	}
}
