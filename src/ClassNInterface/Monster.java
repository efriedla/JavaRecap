package ClassNInterface;

public interface Monster {
	public void sound(); // interface method (does not have a body)
	public void sleep(); // interface method (does not have a body)
}

class FireMoster implements Monster{
	public void sound() {
		// The body of animalSound() is provided here
		System.out.println("The FireMoster says: Char Char");
	}
	public void sleep() {
		// The body of sleep() is provided here
		System.out.println("Zzz Zzz Zzz");
	}

}
class WaterMonster implements Monster{
	public void sound() {
		// The body of animalSound() is provided here
		System.out.println("The WaterMonster says: blup blup");
	}
	public void sleep() {
		// The body of sleep() is provided here
		System.out.println("Ooo Ooo Ooo");
	}

}