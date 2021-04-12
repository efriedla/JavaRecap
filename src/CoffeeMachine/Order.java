package CoffeeMachine;

public class Order{
	int milkInventory;
	int waterInventory;
	int cupsInventory;
	int beansInventory;
	int cupsOfCoffee;
	String type;
	final static int water_per_cup = 200;
	final static int milk_per_cup = 50;
	final static int beans_per_cup = 15;

	public Order(){
		setMilkInventory(5000);
		this.cupsOfCoffee = 1;
		this.type = "coffee";
		setBeansInventory(5000);
	}
	public Order(int cupsOfCoffee){
		this.cupsOfCoffee = cupsOfCoffee;
		setMilkInventory(5000);
		setBeansInventory(5000);
	}
	public void setMilkInventory(int milkInventory){
		this.milkInventory = milkInventory;
		System.out.println("milk " + milkInventory + "ml in inventory");
	}
	public void useMilk(){
		this.milkInventory = milkInventory - (cupsOfCoffee * milk_per_cup);
		System.out.println(cupsOfCoffee * milk_per_cup + " Used milk "+milkInventory + "ml left");
	}
	public void setBeansInventory(int beansInventory){
		this.beansInventory = beansInventory;
	}
	public void useBeans(){
		this.beansInventory = beansInventory - (cupsOfCoffee * beans_per_cup);
		System.out.println(cupsOfCoffee * beans_per_cup + " Used beas "+beansInventory + "ml left");
	}




	public void measureIngrediance() {


	}


	public void makeCoffee() {

	}


	public void charge() {

	}

	public void displayBalance() {

	}

	public void displayIngrediance() {

	}
}
