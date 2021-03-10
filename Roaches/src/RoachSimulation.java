import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class RoachSimulation {
			public static void main(String[] args)
		   {
				
		
			
			String input = JOptionPane.showInputDialog("Enter starting roach population ");
			int inital = Integer.parseInt(input);
		    RoachPopulation bugs = new RoachPopulation(inital);
		    JOptionPane.showMessageDialog(null, "The initial roach population is " + bugs.getRoaches());
		    DecimalFormat wholeFormat = new DecimalFormat("0");
			
		      
			
		    bugs.breed();
		    JOptionPane.showMessageDialog(null, "The Roach Population after Cycle 1 breeding is " + bugs.getRoaches());
		    String one = JOptionPane.showInputDialog("Enter spray percentage for cycle " + 1 + ": ");
		    double sprayPct1= Double.parseDouble(one);
		    bugs.spray(sprayPct1);
		    JOptionPane.showMessageDialog(null, "The Roach population after cycle 1 " + (sprayPct1 * 100) +" percent spraying is " + wholeFormat.format(bugs.getRoaches()));
		
		  
		    bugs.breed();
			JOptionPane.showMessageDialog(null, "The Roach Population after Cycle 2 breeding is " + bugs.getRoaches());	   
			String two = JOptionPane.showInputDialog("Enter spray percentage for cycle " + 2 + ": ");
			double sprayPct2 = Double.parseDouble(two);
			bugs.spray(sprayPct2);
			JOptionPane.showMessageDialog(null, "The Roach population after cycle 2 " + (sprayPct2 * 100)  + " percent spraying is " + wholeFormat.format(bugs.getRoaches()));
		    
	
			bugs.breed();
			JOptionPane.showMessageDialog(null, "The Roach Population after Cycle 3 breeding is " + bugs.getRoaches());	
			String three = JOptionPane.showInputDialog("Enter Spray Percentage for Cycle 3:");
			double sprayPct3 = Double.parseDouble(three);
			bugs.spray(sprayPct3);
			JOptionPane.showMessageDialog(null, "The Roach population after cycle 3 " + (sprayPct3 * 100) + " percent spraying is " + (Math.round(bugs.getRoaches())));
			
			bugs.breed();
			JOptionPane.showMessageDialog(null, "The Roach Population after Cycle 4 breeding is " +(Math.round(bugs.getRoaches())));	
			String four = JOptionPane.showInputDialog("Enter spray percentage for cycle " + 4 + ": ");
			double sprayPct4 = Double.parseDouble(four);
			bugs.spray(sprayPct4);
			JOptionPane.showMessageDialog(null, "The Roach population after cycle 4 " + (sprayPct4 * 100) + " percent spraying is " + (Math.round(bugs.getRoaches())));
		}
	
		      
		   
		}

		