
public class Ninja extends Human {
	public int stealth = 10;
	
	public void stealHealth(Human obj) {
		this.health = this.health + this.stealth;
		obj.health = obj.health - this.stealth;
		
	}
	public void runAway() {
		this.health = this.health - 10;
	}

}
