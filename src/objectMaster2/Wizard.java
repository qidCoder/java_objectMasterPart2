package objectMaster2;

public class Wizard extends Human{	
	public Wizard() {
		health = 50;//Set default health to 50
		intelligence = 8;//Set default intelligence to 8
	}
	
	//Add a method heal(Human) that heals the other human by the wizard's intelligence
	public void heal(Human human) {
		human.health += this.intelligence;
	}
	
	//Add a method fireball(Human) that decreases the other human's health by the wizard's intelligence * 3
	public void fireball(Human victim) {
		victim.health -= (this.intelligence * 3);
	}

}
