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


		Order one = new Order(3);
		one.setMilkInventory(5000);
		one.useMilk();
		one.useBeans();


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
