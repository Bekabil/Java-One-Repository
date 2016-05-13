/**
 * Name:	Bekabil Tolassa
 * Class:	ICS 140
 * 			This program uses scanner object to read in input
 * Project: This program prompt user to enter a number and
 * 			the program calls a method by passing the number
 * 			entered as a value.  the method displays the number
 * 			in triangular pattern form out to the console.
 *
 */
//imports scanner object
import java.util.Scanner;

//class pattern
public class TriangularPattern {

    //main procedure
    public static void main(String[] args) {

        //input is scanner type object
        try (Scanner input = new Scanner(System. in )) {

            //prompt user to input number
            System.out.print("Enter a number to display in pattern ");

            //numPattern is assigned value input
            int numPattern = input.nextInt();

            System.out.println();

            //method call, numPattern is passed by value
            displayPatterns(numPattern);
        }

    }

      //method displayPatterns
       public static void displayPatterns(int num) {

    	 //Nested loop is used to display numbers in triangular format
    	 for (int i = 1; i <= num; i++) {
	        	
	            for (int j = num; j >= 1; j--) {
	            	
	                if (j > i) { 
	                    System.out.print("   ");   
	                }
	                else
	                {
	                	System.out.printf("%2d ", j);
	                		
	                }
	                		
	                
	                }	
	                System.out.println();        
	            }
       
    	
       }
    
 
      
    
}
