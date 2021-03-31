import java.util.Scanner; 
public class BankAccountTester {

public static void main(String[] args) {
Scanner in = new Scanner(System.in);



		System.out.println("Enter amount to start the account: "); 
		Double startBal = in.nextDouble();
		
		System.out.print("Enter the interest rate for this account: ");
		double interestPct = in.nextDouble();
	
		BankAccount myBankAccount = new BankAccount(startBal,interestPct);	
		
		 System.out.println("Enter amount to deposit in the account: ");
		 double deposit = in.nextDouble(); ;
		 myBankAccount.deposit(deposit);
		 
		 System.out.println("Enter amount to withdraw from the account: ");
		 double withdraw = in.nextDouble();
		 myBankAccount.withdraw(withdraw);	 
		 

		myBankAccount.calcInterest();
		System.out.println("Your Bank Account Balance is: " +myBankAccount.getBalance());

		 
		 
		
		 
}
}
		







		
