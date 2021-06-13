
public class Wizard extends Human{
	public int health = 50;
	public int intelligence = 8;
	
	public void heal(Human obj) {
		obj.health = obj.health + this.intelligence;
	}
	public void fireBall(Human obj) {
		obj.health = obj.health - (this.intelligence * 3);
	}

}
