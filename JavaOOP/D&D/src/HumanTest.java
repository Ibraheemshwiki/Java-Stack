
public class HumanTest {

	public static void main(String[] args) {
		Human Omar = new Human();
		Human Yazan = new Human();
		
		Omar.attack(Omar,Yazan);
System.out.println(Yazan.health);
System.out.println(Omar.health);
	}

}
