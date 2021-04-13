package CoffeeMachine;

public class Order{
	int milkInventory;
	int waterInventory;
	int beansInventory;
	int cupsOfCoffee;
	String type;
	final static int water_per_cup = 200;
	final static int milk_per_cup = 50;
	final static int beans_per_cup = 15;

	public Order(){
		setMilkInventory(5000);
		setBeansInventory(5000);
		setWaterInventory(5000);
		this.cupsOfCoffee = 1;
		this.type = "coffee";

	}
	public Order(int cupsOfCoffee){
		this.cupsOfCoffee = cupsOfCoffee;
		setMilkInventory(5000);
		setBeansInventory(5000);
		setWaterInventory(5000);
		this.type = "coffee";
	}

	public Order(int cupsOfCoffee, String type){
		this.cupsOfCoffee = cupsOfCoffee;
		setMilkInventory(5000);
		setBeansInventory(5000);
		setWaterInventory(5000);
		this.type = type;
	}

	/**
	 * Milk Inventory Setter
	 * @param milkInventory
	 */
	public void setMilkInventory(int milkInventory){
		this.milkInventory = milkInventory;
		System.out.println("milk " + milkInventory + "ml in inventory");
	}

	/**
	 * Subtrack milk order from Inventory
	 */
	public void useMilk(){
		this.milkInventory = milkInventory - (cupsOfCoffee * milk_per_cup);
		System.out.println(cupsOfCoffee * milk_per_cup + " Used milk "+milkInventory + "ml left");
	}

	/**
	 * Bean Inventory setter
	 * @param beansInventory
	 */
	public void setBeansInventory(int beansInventory){
		this.beansInventory = beansInventory;
	}

	/**
	 * Subtrack bean usage from inventory
	 */
	public void useBeans(){
		this.beansInventory = beansInventory - (cupsOfCoffee * beans_per_cup);
		System.out.println(cupsOfCoffee * beans_per_cup + " Used beas "+beansInventory + "ml left");
	}

	/**
	 * Set water Inventory
	 * @param waterInventory
	 */
	public void setWaterInventory(int waterInventory){
		this.waterInventory = waterInventory;
	}

	/**
	 * Subtrack water used from inventory
	 */
	public void useWater(){
		this.waterInventory -= (cupsOfCoffee * water_per_cup);
	}


	/**
	 * Display coffee order
	 */
	public void coffeeProcess(){
		System.out.println("Starting to make a coffee");
		System.out.println("Grinding coffee beans");
		System.out.println("Boiling water");
		System.out.println("Mixing boiled water with crushed coffee beans");
		System.out.println("Pouring coffee into the cup");
		System.out.println("Coffee is ready!");
	}


}
