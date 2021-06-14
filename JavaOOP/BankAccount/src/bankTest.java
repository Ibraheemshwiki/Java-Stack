
public class bankTest {

	public static void main(String[] args) {
		BankAccount user1 = new BankAccount();
		user1.addCheckings(1000);
		user1.addSavings(3000);
		System.out.println(user1.getAccountNumber());
		System.out.println(user1.getSavingsBalance());
		System.out.println(user1.getCheckingBalance());
		
	}

}
