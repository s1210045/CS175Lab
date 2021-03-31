import java.util.Scanner;
public class BankThreshold {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		
			
			System.out.println("Enter opening balance: ");
			double newAmt = in.nextDouble();
			
			System.out.println("Enter interest rate:  ");
			double interest = in.nextDouble();
			
			BankAccount myBankAccount = new BankAccount(newAmt, interest);
			
			System.out.println("Enter the threshold: ");
			while (in.hasNextDouble()){
				int months = 0;
				double numb = in.nextDouble();
				//System.out.println(numb);
				while (myBankAccount.getBalance() < numb)
				{myBankAccount.calcInterest();
					months++;
				}
				System.out.println("It will take " + months +" months to reach the threshold");
				
				System.out.println("Enter another threshold or enter 'End': ");
			} 
			
			
			
			
			
				}


	}

			
		
