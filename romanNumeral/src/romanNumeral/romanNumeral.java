package romanNumeral;
import java.util.Scanner;


public class romanNumeral {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter a year: ");
		int number = in.nextInt();
		
		
		
	if (number > 3999)
	{
	System.out.println("Choose number only under 3999");}
	
	int number1 = 0;
	
	int num2 = 0;
	
	int num3 = 0;
	
	int num4 = 0;
	
	if (number >= 1000) {
		 number1 = number/1000;
		 if (number1 == 1) {
			System.out.print("M");
		}
		else if (number1 == 2) {
			System.out.print("MM");
		}
		else if (number1 == 3) {
			System.out.print("MMM");
		}
	}

	if (number >= 100) {
		 num2 = (number/100)%10;
		
			if (num2 == 1) {
			System.out.print("C");}
			
			else if (num2 == 2) {
				System.out.print("CC");
			}
			else if (num2 == 3) {
				System.out.print("CCC");
			}
			else if (num2 == 4) {
				System.out.print("CD");
			}
			else if (num2 == 5) {
				System.out.print("D");
			}
			else if (num2 == 6) {
				System.out.print("DC");
			}
			else if (num2 == 7) {
				System.out.print("DCC");
			}	
			else if (num2 == 8) {
				System.out.print("DCCC");
			}	
			else if (num2 == 9) {
				System.out.print("CM");
			}	
		}
		
		if (number >= 10) {
			 num3 = number%100/10;;
			if (num3 == 1) {
				System.out.print("X");
			}
			else if (num3 == 2) {
				System.out.print("XX");
			}
			else if (num3 == 3) {
				System.out.print("XXX");
			}
			else if (num3 == 4) {
				System.out.print("XL");
			}
			else if (num3 == 5) {
				System.out.print("L");
			}
			else if (num3 == 6) {
				System.out.print("LX");
			}
			else if (num3 == 7) {
				System.out.print("LXX");
			}
			else if (num3 == 8) {
				System.out.print("LXXX");
			}
			else if (num3 == 9) {
				System.out.print("XC");
			}
	
		if (number >= 1) {
			 num4 = (number/1)%10;
			if (num4 == 1) {
				System.out.print("I");
			}
			else if (num4 == 2) {
				System.out.print("II");
			}
			else if (num4 == 3) {
				System.out.print("III");
			}
			else if (num4 == 4) {
				System.out.print("IV");
			}
			else if (num4 == 5) {
				System.out.print("V");
			}
			else if (num4 == 6) {
				System.out.print("VI");
			}
			else if (num4 == 7) {
				System.out.print("VII");
			}
			else if (num4 == 8) {
				System.out.print("VIII");
			}
			else if (num4 == 9) {
				System.out.print("IX");
			}
			
			System.out.println(); 
			}
		}
	}

}



		
	
