package CoffeeMachine;

import java.security.PublicKey;
import java.util.Scanner;

/**
 * https://github.com/seycileli/CoffeeMachine
 */
public class coffeeMachine {
	final static int water_per_cup = 200;
	final static int milk_per_cup = 50;
	final static int beans_per_cup = 15;


	public static void main(String[] args) {


		Order one = new Order(24);
		one.hasStock();

		//menu for coffee
		Scanner sc = new Scanner(System.in);
		sc.close();
	}
	public static void welcomeMenu(){
		System.out.println("Hello what could I get started for you today");
		System.out.println("");
	}


}
