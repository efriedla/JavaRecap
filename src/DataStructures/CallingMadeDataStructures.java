package DataStructures;
import java.util.ArrayList;

public class CallingMadeDataStructures {
	public static void main(String[] args) {
		//ArrayList = resizable array
		ArrayList<String> cars = new ArrayList<String>(); // Create an ArrayList object
		//add to arraylist
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		System.out.println(cars);

		//read = get
		System.out.println(cars.get(1) + " is at 1"); //"BMW
		//update set
		System.out.println(cars.set(1,"Toyota") + "  BMW is " + cars.get(1));

		for (int i = 0; i < cars.size(); i++) {
			System.out.println(cars.get(i) + " is "+ i);
		}
		System.out.println(cars.remove(0) + " removed index 0 "+ cars.get(0)); //"BMW
		System.out.println(cars.size() + " size");
		cars.clear(); //empty arraylist
		System.out.println(cars.size() + " size after clear");

	}
}
