package randArrayAndSearch;
import java.util.Random;


public class randArrayAndSearch {

    public static void main(String[] args) {
    	
		
       
        Random generator= new Random();
       
        int [] randomArray= new int [50];
        
        for(int i=0; i<randomArray.length; i++) {
        	randomArray[i]= 1+ generator.nextInt(25);
        	System.out.print(randomArray[i]+",");  
        }
        
        int largest = 0;
        int smallest = 30;
        
        for (int i = 1; i < randomArray.length; i++) {
        	if (randomArray[i] > largest)
        		largest = randomArray[i];
        
        	if (randomArray[i] < smallest) 
        		smallest = randomArray[i];
        	
        }
        System.out.println("\nThe largest: " + largest);
        System.out.println("The smallest: " + smallest);
        System.out.println("Product of Largest and Smallest:"+ (smallest*largest));
     }

}




