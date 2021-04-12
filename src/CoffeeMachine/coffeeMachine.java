package CoffeeMachine;

import java.security.PublicKey;

/**
 * Stage #1: Hello, coffee!
 * Write a program that puts basic information on the screen: Give the machine a chance to tell the customers what it’s doing!
 *
 * Description:
 *
 * Let's start with a program that makes you a coffee – virtual coffee, of course.
 *
 * But in this project, you will implement functionality that simulates a real coffee machine. It can run out of milk,
 * it can run out of coffee beans, it can make different varieties of coffee, and it can take the money for making a coffee.
 *
 * The first version of the program just makes you a coffee. It prints to the standard output what it is doing as it makes a coffee.
 *
 * Output example:
 * Using the "Hello, World!" program, write the program that prints all lines as in the example below.
 *
 * Starting to make a coffee
 *
 * Grinding coffee beans
 *
 * Boiling water
 *
 * Mixing boiled water with crushed coffee beans
 *
 * Pouring coffee into the cup
 *
 * Pouring some milk into the cup
 *
 * Coffee is ready!
 */
public class coffeeMachine {
	final static int water_per_cup = 200;
	final static int milk_per_cup = 50;
	final static int beans_per_cup = 15;


	public static void main(String[] args) {
		//ingrediance
//		int coffeebeans = 1000;
//		int water = 1000;
//		int milk = 1000;
//		int cups = 100;
//		int balance = 100;

		Order one = new Order(3);
		one.setMilkInventory(5000);
		one.useMilk();
		one.useBeans();
		//process
		//for 1 cup of black coffee
		//grind  beans 1000 - 15
		// boil  water 1000 - 200 ml
		// milk 50 ml
		//mix water and beans
		//por in 1 cup
		// $1
		// serve

	//makeCoffee();
		//coffeebeans = coffee(coffeebeans);
		//measureIngrediance(3,"coffee");



	}
	public static void makeCoffee(){
		System.out.println("Starting to make a coffee");
		System.out.println("Grinding coffee beans");
		System.out.println("Boiling water");
		System.out.println("Mixing boiled water with crushed coffee beans");
		System.out.println("Pouring coffee into the cup");
		System.out.println("Coffee is ready!");
	}
	public static void measureIngrediance(int cups, String type){
		System.out.println(type);
		if (type == "coffee"){
			int waterNeeded = cups * water_per_cup;
			int milkNeeded = cups * milk_per_cup;
			int beensNeeded = cups * beans_per_cup;
//			System.out.println(waterNeeded);
//			System.out.println(milkNeeded);
//			System.out.println(beensNeeded);
			//check if has enough ingrediance
			//call next step
			boilWater();
			mixWaterNBeans();
			pourcoffee();
			serveCoffee();

		}else{
			System.out.println(type + " no recipy");
		}

	}

	public static void boilWater(){
		System.out.println("Boiling water");

	}
	public static void mixWaterNBeans(){
		System.out.println("Mixing boiled water with crushed coffee beans");

	}
	public static void pourcoffee(){
		System.out.println("Pouring coffee into the cup");

	}
	public static void serveCoffee(){
		System.out.println("Coffee is ready!");

	}

}
