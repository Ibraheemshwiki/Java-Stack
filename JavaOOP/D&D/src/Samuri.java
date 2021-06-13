
public class Samuri extends Human{
	public int health = 200;
	public static int counter = 0;
	public Samuri() {
		counter++;
	}
	
	public void deathBlow(Human obj) {
		obj.health = 0;
		this.health = this.health/2;
	}
	public void meditate() {
		this.health = this.health + (this.health/2);
	}
	
	public int howMany() {
		return counter;
	}
}
