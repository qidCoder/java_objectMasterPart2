package objectMaster2;

public class Ninja extends Human{
	public Ninja() {
		stealth = 10;//Set default stealth to 10
	}
	
	//Add a method steal(Human) that takes the amount of stealth the ninja has, removes it from the other human's health, and adds it to the ninja's
	public void steal(Human victim) {
		victim.health -= this.stealth;
		this.health += this.stealth;
	}

	//Add a method runAway() that decreases their health by 10
	public void runAway() {
		this.health -= 10;
	}

}
