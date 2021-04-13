package CoffeeMachine;

import java.security.PublicKey;

/**
 * https://github.com/seycileli/CoffeeMachine
 */
public class coffeeMachine {
	final static int water_per_cup = 200;
	final static int milk_per_cup = 50;
	final static int beans_per_cup = 15;


	public static void main(String[] args) {


		Order one = new Order(30);
		one.hasStock();


	}


}
