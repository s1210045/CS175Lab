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
   }


   public void withdraw(double amount)
   {
	  if(amount <= balance){
		  balance = balance - amount;
		
	}
	
	else {
		System.out.println("Insufficient Funds to support withdrawal.");}
}
   
   
   public void calcInterest() {
	   double interest = balance * interestPct; 
	   balance = balance + interest;
	   
    }
 
  
   
   public double getBalance()
   {
      return balance;
   }
}