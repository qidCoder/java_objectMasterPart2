package objectMaster2;
//Test these methods work using a HumanTest class

public class HumanTest {

	public static void main(String[] args) {
		//instantiate a human
		Human jerry = new Human();
		Human george = new Human();
		
		jerry.displayProperties();
		george.displayProperties();
		
		jerry.attack(george);
		
		jerry.displayProperties();
		george.displayProperties();
		
		//instantiate other humans
		Wizard wiz1 = new Wizard();
		Ninja ninja1 = new Ninja();
		Samurai sam1 = new Samurai();
		Samurai sam2 = new Samurai();
		
		wiz1.displayProperties();
		ninja1.displayProperties();
		sam1.displayProperties();
		
		wiz1.heal(sam1);
		sam1.displayProperties();
		wiz1.fireball(sam1);
		sam1.displayProperties();
		
		ninja1.steal(sam1);
		sam1.displayProperties();
		ninja1.displayProperties();
		ninja1.runAway();
		ninja1.displayProperties();
		
		sam1.deathBlow(ninja1);
		sam1.displayProperties();
		ninja1.displayProperties();
		sam1.meditate();
		sam1.displayProperties();
		
		System.out.println(sam1.howMany());
	}

}
