
/**
 * Name:	Bekabil Tolassa
 * Class:	ICS 140
 * Project:	This program is computing 2013 U.S. Federal Personal Tax
 * 			This program prompts user to input filling status and taxable income
 * 			based on the input and tax rate bracket, tax will be calculated and displayed to console
 * 			This program uses nested if else conditional statement to evaluate and compute.
 * Date:	February 26, 2014
 * 
 */

//imports scanner object
import java.util.Scanner;

//class ComputeTax
public class ComputeTax {
	//main procedure
	public static void main(String[] args) {
		
		//constant variables are declared and assigned with unchanged percentile rate
		final double TAX_RATE_10 = 0.10;
		final double TAX_RATE_15 = 0.15;
		final double TAX_RATE_25 = 0.25;
		final double TAX_RATE_28 = 0.28;
		final double TAX_RATE_33 = 0.33;
		final double TAX_RATE_35 = 0.35;
		final double TAX_RATE_396 = 0.396;
		
		//input is a type scanner object
		try (Scanner input = new Scanner(System.in)){
			
		//prompt the user to enter filing status and assign it to status variable
		System.out.print(
			"0-single filer"
			+ "\n1-married filing jointly or qualifying widow(er)"
			+ "\n2-married filing separately"
			+ "\n3-head of household\n" +
			"\nEnter the filing status: ");
		
		     int status = input.nextInt();
		
		//check if valid input is entered for filing status
		if ((status == 0) || (status == 1) || (status == 2) || (status == 3)){
			
		//prompt the user to enter taxable income
		System.out.print("Enter the taxable income: ");
		double income = input.nextDouble();
		
		//variable tax is declared and assinged value of 0.
		double tax = 0;
	
		//compute tax for single filer
		if (status == 0){
			if(income <= 8925){
			  tax = income * TAX_RATE_10;
			}
			else if (income <= 36250){
			  tax = 8925 * TAX_RATE_10 + (income - 8925) * TAX_RATE_15;
			}
			else if (income <= 87850){
			  tax = 8925 * TAX_RATE_10 + (36250 - 8925) * TAX_RATE_15 + (income - 36250) * TAX_RATE_25 ;
			}
			else if (income <= 183250){
			  tax = 8925 * TAX_RATE_10 + (36250 - 8925) * TAX_RATE_15 + (87850 - 36250) * TAX_RATE_25 + 
			  (income - 87850) * TAX_RATE_28;
			}
			else if (income <= 398350){
			  tax = 8925 * TAX_RATE_10 + (36250 - 8925) * TAX_RATE_15 + (87850 - 36250) * TAX_RATE_25 + 
			  (183250 - 87850) * TAX_RATE_28 + (income - 183250) * TAX_RATE_33;
			}	  
			else if (income <= 400000){
			  tax = 8925 * TAX_RATE_10 + (36250 - 8925) * TAX_RATE_15 + (87850 - 36250) * TAX_RATE_25 + 
			  (183250 - 87850) * TAX_RATE_28 + (398350 - 183250) * TAX_RATE_33 + (income - 398350) * TAX_RATE_35;	
			}
			
			else if (income > 400000){
			  tax = (8925 * TAX_RATE_10 + (36250 - 8925) * TAX_RATE_15 + (87850 - 36250) * TAX_RATE_25 + 
			  (183250 - 87850) * TAX_RATE_28 + (398350 - 183250) * TAX_RATE_33 + 
			  (400000 - 398350) * TAX_RATE_35 + (income - 400000) * TAX_RATE_396);	
			}
		}
		
		//compute tax for married filling jointly or qualifying widow(er)
		else if (status == 1){
			if(income <= 17850){
				  tax = income * TAX_RATE_10;
			}	
				else if (income <= 72500){
				  tax = 17850 * TAX_RATE_10 + (income - 17850) * TAX_RATE_15;
				}
				else if (income <= 146400){
				  tax = 17850 * TAX_RATE_10 + (72500 - 17850) * TAX_RATE_15 + (income - 72500) * TAX_RATE_25 ;
				}
				else if (income <= 223050){
				  tax = 17850 * TAX_RATE_10 + (72500 - 17850) * TAX_RATE_15 + (146400 - 72500) * TAX_RATE_25 + 
				  (income - 146400) * TAX_RATE_28;
				}
				else if (income <= 398350){
				  tax = 17850 * TAX_RATE_10 + (72500 - 17850) * TAX_RATE_15 + (146400 - 72500) * TAX_RATE_25 + 
				  (223050 - 146400) * TAX_RATE_28 + (income - 223050 ) * TAX_RATE_33;
				}	  
				else if (income <= 450000){
				  tax = 17850 * TAX_RATE_10 + (72500 - 17850) * TAX_RATE_15 + (146400 - 72500) * TAX_RATE_25 + 
				  (223050 - 146400) * TAX_RATE_28 + (398350 - 223050) * TAX_RATE_33 + (income - 398350) * TAX_RATE_35;	
				}
				
				else if (income > 450000){
				  tax = 17850 * TAX_RATE_10 + (72500 - 17850) * TAX_RATE_15 + (146400 - 72500) * TAX_RATE_25 + 
				  (223050 - 146400) * TAX_RATE_28 + (398350 - 223050) * TAX_RATE_33 + (450000 - 398350) * TAX_RATE_35 + 
				  (income - 450000) * TAX_RATE_396;	
				}	
		}
		
		//compute tax for married filing separately
		else if (status == 2){
			if(income <= 8925){
				  tax = income * TAX_RATE_10;
			}	
				else if (income <= 36250){
				  tax = 8925 * TAX_RATE_10 + (income - 8925) * TAX_RATE_15;
				}
				else if (income <= 73200){
				  tax = 8925 * TAX_RATE_10 + (36250 - 8925) * TAX_RATE_15 + (income - 36250) * TAX_RATE_25 ;
				}
				else if (income <= 111525){
				  tax = 8925 * TAX_RATE_10 + (36250 - 8925) * TAX_RATE_15 + (73200 - 36250) * TAX_RATE_25 + 
				  (income - 73200) * TAX_RATE_28;
				}
				else if (income <= 199175){
				  tax = 8925 * TAX_RATE_10 + (36250 - 8925) * TAX_RATE_15 + (73200 - 36250) * TAX_RATE_25 + 
				  (111525 - 73200) * TAX_RATE_28 + (income - 111525) * TAX_RATE_33;
				}	  
				else if (income <= 225000){
				  tax = 8925 * TAX_RATE_10 + (36250 - 8925) * TAX_RATE_15 + (73200 - 36250) * TAX_RATE_25 + 
				  (111525 - 73200) * TAX_RATE_28 + (199175 - 111525) * TAX_RATE_33 + (income - 199175) * TAX_RATE_35;	
				}
				
				else if (income > 225000){
				  tax = 8925 * TAX_RATE_10 + (36250 - 8925) * TAX_RATE_15 + (73200 - 36250) * TAX_RATE_25 + 
				  (111525 - 73200) * TAX_RATE_28 + (199175 - 111525) * TAX_RATE_33 + (225000 - 199175) * TAX_RATE_35 + 
				  (income - 225000) * TAX_RATE_396;	
				}				
			
		}
		
		//compute tax for head of household
		else if (status == 3){
			if(income <= 12750){
				  tax = income * TAX_RATE_10;
			}	
				else if (income <= 48600){
				  tax = 12750 * TAX_RATE_10 + (income - 12750) * TAX_RATE_15;
				}
				else if (income <= 125450){
				  tax = 12750 * TAX_RATE_10 + (48600 - 12750) * TAX_RATE_15 + (income - 48600) * TAX_RATE_25 ;
				}
				else if (income <= 203150){
				  tax = 12750 * TAX_RATE_10 + (48600 - 12750) * TAX_RATE_15 + (125450 - 48600) * TAX_RATE_25 + 
				  (income - 125450) * TAX_RATE_28;
				}
				else if (income <= 398350){
				  tax = 12750 * TAX_RATE_10 + (48600 - 12750) * TAX_RATE_15 + (125450 - 48600) * TAX_RATE_25 + 
				  (203150 - 125450) * TAX_RATE_28 + (income - 203150) * TAX_RATE_33;
				}	  
				else if (income <= 425000){
				  tax = 12750 * TAX_RATE_10 + (48600 - 12750) * TAX_RATE_15 + (125450 - 48600) * TAX_RATE_25 + 
				  (203150 - 125450) * TAX_RATE_28 + (398350 - 203150) * TAX_RATE_33 + (income - 398350) * TAX_RATE_35;	
				}
				
				else if (income > 425000){
				  tax = 12750 * TAX_RATE_10 + (48600 - 12750) * TAX_RATE_15 + (125450 - 48600) * TAX_RATE_25 + 
				  (203150 - 125450) * TAX_RATE_28 + (398350 - 203150) * TAX_RATE_33 + (425000 - 398350) * TAX_RATE_35 + 
				  (income - 425000) * TAX_RATE_396;	
				}		
		}
		//prints out calculated tax to console
		System.out.println("\nTax is " + (int)(tax * 100) / 100.0);
		
		}
		//display message for invalid status input
		else 
			System.out.println("\nInvalid status!");
			System.exit(1);
		
	}
		
		
  
  }
		
}
	
	



