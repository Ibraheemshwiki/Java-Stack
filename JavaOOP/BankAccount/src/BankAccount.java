import java.util.Random;
public class BankAccount {
	private String accountNumber = "";
	private double checkingBalance = 0;
	private double savingsBalance = 0;
	public static int membersCreated = 0;
	public static int totalMoneyDeposited = 0;
	
	private String generate() {
		Random r = new Random();
		String num="";
		for (int i= 0 ; i < 10 ; i++) {
			int val = r.nextInt(10);
			num+=val;
		}
		return num;	
	}
	
	public BankAccount() {
		this.accountNumber = this.generate();
		membersCreated++;
	}


	public BankAccount(Double checkingBalance, Double savingsBalance) {
		
		this.accountNumber = this.generate();
		this.checkingBalance = checkingBalance;
		this.savingsBalance = savingsBalance;
		membersCreated++;
	}

	public String getAccountNumber() {
		return accountNumber;
	}


	public double getCheckingBalance() {
		return checkingBalance;
	}

	public void setCheckingBalance(Double checkingBalance) {
		this.checkingBalance = checkingBalance;

	}

	public double getSavingsBalance() {
		return savingsBalance;
	}

	public void setSavingsBalance(Double savingsBalance) {
		this.savingsBalance = savingsBalance;
		
	}
	public void addCheckings(double amount) {
		this.checkingBalance += amount;
		totalMoneyDeposited += amount;
	}
	public void addSavings(double amount) {
		this.savingsBalance += amount;
		totalMoneyDeposited += amount;
	}
	public void withdraw(BankAccount user, int amount) {
		if ((user.checkingBalance - amount) >= 0) {
			user.checkingBalance -= amount;	
		} else {
			System.out.println("insufficient funds");
		}
	}
	public void getTotalMoney(BankAccount user) {
	   double total = user.checkingBalance + user.savingsBalance;
	   System.out.println(total);
	}
	
}
