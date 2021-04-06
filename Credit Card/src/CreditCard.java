import java.util.Scanner;
public class CreditCard {


public static void main(String[] args) {
		
		System.out.println("Enter a credit card number or -99 to end: ");
		Scanner in = new Scanner(System.in);

		while (in.hasNextLine()) {
			String Number = in.nextLine();
			
			if (Number.equals("-99")) {
				System.out.println("goodbye");
				break;
			}
			
		int i = 0;
		while (i < Number.length()) {Number.charAt(i);
		char character = Number.charAt(i);
			if (character == ' ' || character == '-') {
				
				String before = Number.substring(0, i);
				String after = Number.substring(i +1);
				Number = before + after;
			}
			else {
				i++;
			}
		}
		System.out.println(Number);
		System.out.println("Enter a credit card number or -99 to end: ");
		}
	}
}