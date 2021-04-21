import java.util.ArrayList;

public class BankAccountTester2 {

	public static void main(String[] args) 
	{
		
		BankAccount gil = new BankAccount("Gil", 500);
		BankAccount joe = new BankAccount("Joe", 1000);
		BankAccount fred = new BankAccount("Fred", 2000);
		BankAccount sally = new BankAccount("Sally", 2500);
		

		ArrayList<BankAccount> accountList = new ArrayList<>();
		
		
		accountList.add(gil);
		accountList.add(joe);
		accountList.add(fred);
		
		for(BankAccount account: accountList)
		{
			System.out.println(account.getAccount());
		}
		
		//sally
		accountList.add(sally);
	

		BankAccount most = accountList.get(0);
		double largest = 0;
		
		
		
		for(int i=1; i < accountList.size(); i++) {
			if (largest < accountList.get(i).getBalance()) {
				
				largest = accountList.get(i).getBalance();
				most = accountList.get(i);
			}
		}
		
		System.out.println( most.getAccount());
		
	//sally
		accountList.remove(sally);
	
		most = accountList.get(0);
		largest = 0;
				
		
		for(int i = 1; i < accountList.size(); i++) {
			
			if (largest < accountList.get(i).getBalance()) {
				
				most = accountList.get(i);
				largest = accountList.get(i).getBalance();
			}
		}
		
		System.out.println(most.getAccount());
}
}
