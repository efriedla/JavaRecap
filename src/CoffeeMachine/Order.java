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
	}

	/**
	 * Subtrack milk order from Inventory
	 */
	public int useMilk(){
		return this.milkInventory -= (cupsOfCoffee * milk_per_cup);
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
	public int useBeans(){
		return this.beansInventory = beansInventory - (cupsOfCoffee * beans_per_cup);
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
	public int useWater(){
		return this.waterInventory -= (cupsOfCoffee * water_per_cup);
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

	/**
	 * Check if able to fullfill order
	 */
	public void hasStock(){
		try{
			if(useMilk() > 0 && useWater() > 0 && useBeans() > 0){
				System.out.println(cupsOfCoffee + " can be made \n"+ milkInventory + " milk remains\nWater left " +
						waterInventory + "\nBeans left " + beansInventory);
			}else{
				System.out.println(cupsOfCoffee + " can not be made "+ milkInventory + " milk remains\n water left " +
						waterInventory + "\nBeans left " + beansInventory);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}


}
