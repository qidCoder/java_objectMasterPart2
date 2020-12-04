package objectMaster2;

public class Samurai extends Human{
	protected static int samurai_count = 0;//MUST use static here or else it will not keep the sum in this class and instead will sum for each individual instance
	//Static means it belongs to the class
	//	As methods in the class belong to the object we make (like the specific pizza), static methods and variables belong to the class itself

	public Samurai() {
		health = 200;//Set a default health of 200
		samurai_count++;
	}

	//Add a method deathBlow(Human) that kills the other human, but reduces the Samurai's health by half
	public void deathBlow(Human victim) {
		victim.health = 0;
		this.health /= 2;
	}
	
	//Add a method meditate() that heals the Samurai for half of their current health.
	public void meditate() {
		this.health += this.health/2;
	}
	
	//Add a method howMany() that returns the total current number of Samurai.
	public int howMany() {
		return samurai_count;
	}

}
