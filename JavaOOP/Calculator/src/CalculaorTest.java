
public class CalculaorTest {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.setOperandOne(15.2);
		c.setOperandTwo(0.7);
		c.setOperation("-");
		c.performOperation();
		System.out.println(c.getResult());
		

	}

}
