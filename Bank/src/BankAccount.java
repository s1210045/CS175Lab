public class BankAccount
{
   private double balance;
   private double interestPct;

 
   public BankAccount(double amount, double interest)
   {
   balance = amount;
   interestPct = interest;
   }

  
   
   public void deposit(double amount)
   {
      balance = balance + amount;
      System.out.println("Deposited:" + amount);
   }


   public void withdraw(double amount) {
	if
	(amount <= balance) 
	{	balance = balance - amount;
	 System.out.println("Withdrew:"+ amount);
	}
	
	else 
	{System.out.println("Insufficient Funds to support withdrawal.");}
}
   
   
   public void calcInterest() {
   double interest = balance * interestPct; 
   balance = balance + interest;
   System.out.println("Interest:" + interest); 
    }
 
  
   
   public double getBalance()
   {
      return balance;
   }
}