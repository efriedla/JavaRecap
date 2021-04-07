package ClassNInterface;

public class Main {
	int x;
	public Main(int y) {
		x = y;  // Set the initial value for the class attribute x
	}

    public static void main(String[] args) {
	    Main myObj1 = new Main(5);

    	System.out.println(myObj1.x);
	    myObj1.x = 30;
	    System.out.println(myObj1.x);

	    CarMethod car = new CarMethod("x", "y", 1995);
	    System.out.println("Make " + car.make + "\nModel " + car.model +"\nyear " + car.year);
	    car.setServiceDate(2001);
	    System.out.println(car.ServiceDate());
    }
}
