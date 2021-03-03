import java.util.Scanner; 
public class BankAccountTester {

public static void main(String[] args) {
Scanner in = new Scanner(System.in);



		System.out.println("Enter amount to start the account: "); 
		Double startBal = in.nextDouble();
		System.out.print("Enter the interest rate for this account: ");
		double interestPct = in.nextDouble();
	
		BankAccount myBankAccount = new BankAccount(startBal,interestPct);	
		System.out.println("Created new account with "+ startBal+" balance and interest rate " + interestPct);

		
		
		 System.out.println("Enter amount to deposit in the account: ");
		 double deposit = in.nextDouble(); ;
		 myBankAccount.deposit(deposit);
		 
		 System.out.println("Enter amount to withdraw from the account: ");
		 double withdraw = in.nextDouble();
		 myBankAccount.withdraw(withdraw);	 

		 System.out.print("Enter amount to withdraw from the account ");
		 double withdraw2 = in.nextDouble();
		 in.nextLine();
		 myBankAccount.withdraw(withdraw2);
		 
		 
		
		 System.out.print("If you want me to generate interest, enter 'Yes': ");	 
		 String becomes=in.nextLine();
		 
		 if (becomes.equals("yes") ) {
			 
		 		myBankAccount.calcInterest();
		 		System.out.println("This account balance is :" +myBankAccount.getBalance()); }
		 in.close();
}
}
		







		
