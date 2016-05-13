/**
 * Name:	Bekabil Tolassa
 * Class:	ICS 140
 * Project: This program prompt user to enter the year and first day of the year
 *          This program does make a calendar for the year given by user and
 *          print the calendar out to console
 *          This program uses scanner class for input from user
 * 
 */
// imports scanner class
import java.util.Scanner;

//class calendar
public class Calendar {

	//main procedure the program starts execution from here
	public static void main(String[] args) {
		
		//input is type scanner
		try(Scanner input = new Scanner(System.in)){
		
		//variable declaration for months as string type
		String currentMonth = "January", secondMonth = "February", thirdMonth = "March", 
			   fouthMonth = "April", fifthMonth = "May", sixthMonth = "June",	
			   seventhMonth = "July",eighthMonth = "August", ninthMonth = "Septermber",
			   tenthMonth = "October",eleventhMonth = "November",twelvethMonth = "December";
		
		//variable declaration	
		int index = 0; //keeps track of the days to be printed
		int monthCounter = 1; // counts the months in a year
		int dayCounter = 31; // holds number of days in a month
		int spaceCounter = 0; //holds exact location of the first day of next month
		char leapYear = 'N'; //leap year is set to 'N' to begin with
			
		//prompts user to enter the year and the first day of the year
		System.out.println("input example: January 01, 2007 is entered as 2007 2");
		System.out.println("input example: January 01, 1915 is entered as 1915 6");
		System.out.println();
		System.out.print("Enter the year followed by space and the first day (1 - 7) of the year: ");	
		//year is assigned the year value	
		int year = input.nextInt();
		
		//spaceCounter is assigned the first day of the year
		spaceCounter= input.nextInt();
		
		System.out.println();
		System.out.println();
		
		//first check if the first day input is valid that must be between 1 - 7
		if (spaceCounter == 1 || spaceCounter == 2 || spaceCounter == 3 || spaceCounter == 4 ||
				                 spaceCounter == 5 || spaceCounter == 6 || spaceCounter == 7)  {
		
		  //do while loops twelve times for twelve months in a year and process the job 	    
		  do {
	       //index is set to 1, used to print out number of days		  
   		   index = 1;
   		
   		   //check if the year is leap year
		   if (year % 4 == 0)
		   //leapYear is assigned 'Y'	
		   leapYear = 'Y';
		
		   //print out year and current month every time during the loop	    		                
		   System.out.print("\n"); 
		   System.out.print("        " + currentMonth  + "  " + year + " \n ______________________________\n   "
				         + "Sun Mon Tue Wed Thu Fri Sat ");
			                
           // if else statement are used to indent properly where starting date to be printed    
		   if(spaceCounter == 1){ // 1st day is Sunday 
             System.out.print("\n    "); 	
		   }
			            
		   else if (spaceCounter == 2 ){ // 1st day is Monday
			 System.out.print("\n        "); 
		   }
			            
		   else if(spaceCounter == 3){
			            	System.out.print("\n            ");// 1st day is 3rd day
		   }
			            
		   else if(spaceCounter == 4){
			            	System.out.print("\n                "); // 1st day is the 4th day Wed
		   }
			              
			            
		   else if (spaceCounter == 5) {
			            	System.out.print("\n                    "); // 1st day is the 5th day Thur
		   }
			            
		   else if (spaceCounter == 6) {
			            	
			            	System.out.print("\n                        "); // 1st day is the 6th day
		   }
			            
		   else if (spaceCounter == 7) {
			            	
			            	System.out.print("\n                            "); //1st day is the 7th day
		   }
			            
			            
		   // for statement prints out dates of calendar for given days of the month              
		 for (int i = 1; i <= dayCounter; i++ ) {
					
			//if statement executes if dates are 1 digit
			 if(index < 10){
			   System.out.print( index);	
			   System.out.print("   ");
			   index  += 1;
			 }
			//else statement executes if dates are 2 digits
			 else {	
			   System.out.print( index);
			   System.out.print("  ");
			   index  += 1;
			 }
			 
			 //switch statement is used to give new lines based on each condition
			 switch (spaceCounter) {
			 
			 	case 1:
					   // makes a new line for the date starts on the 1st day
					   if (index  == 8 || index  == 15 || index  == 22 || index  == 29 || index == 36 ){
						   System.out.print("\n    ");
					   } 
				break;
					 
				case 2:
						// makes a new line for the date starts on the 2nd day
						if (index  == 7 || index  == 14 || index  == 21 || index  == 28 || index == 35){
							System.out.print("\n    ");	
						}  
				break; 
						
				case 3:
						// makes a new line for the date starts on the 3rd day
						if (index  == 6 || index  == 13 || index == 20  || index  == 27 || index == 34 ){
							System.out.print("\n    ");		
						}  
				break;
						
				case 4:
						// makes a new line for the date starts on the 4th day
						if (index == 5 || index == 12 || index == 19 || index == 26 || index == 33){
							System.out.print("\n    ");		
						}  
				break; 
						
				case 5:
						// makes a new line for the date starts on the 5th day
						if (index == 4 || index == 11 || index == 18 || index == 25 || index == 32){
							System.out.print("\n    ");		
						}  
				break;
				
				case 6:
						// makes a new line for the date starts on the 6th day
						if (index == 3 || index == 10 || index == 17 || index == 24 || index == 31){
							System.out.print("\n    ");		
						}  
				break; 
						
				case 7:
						// makes a new line for the date starts on the 7th day
						if (index == 2 || index == 9 || index == 16 || index == 23 || index == 30){
							System.out.print("\n    ");		
						} 
				break; 
						
					
			 }	
						
				
					
		 }
		 
	     System.out.print("\n");
		 index = 0; // index is set to 0 to start over again
		 ++monthCounter; //monthCounter is updated to next month
				     		     
		 //if else statement is used to control and update months and dates of the month
		 //spaceCounter is updated for each month based on monthCounter
		 //spaceCounter + dayCounter % 7 calculates location for next month to start.
		 if (monthCounter == 2){  
			
			currentMonth = secondMonth;  //currentMonth gets February
			//spaceCounter is assigned to the next month starting date
			spaceCounter = ((spaceCounter + dayCounter) % 7);
			dayCounter = 28;
			
			// if it is leap year assign, February is 29 days 
			if (leapYear == 'Y')
			dayCounter = 29;
			
		 }    
		 else if (monthCounter == 3){
			 
			currentMonth = thirdMonth; // currentMonth gets March
				    	
			spaceCounter = ((spaceCounter + dayCounter) % 7);
			dayCounter = 31;
			
		 }		    
		 else if (monthCounter == 4){
			 
			currentMonth = fouthMonth; // currentMonth gets April
			  	
			spaceCounter = ((spaceCounter + dayCounter) % 7);
			dayCounter = 30;
			
		 }
				    
		 else if (monthCounter == 5){
			 
			currentMonth = fifthMonth; // currentMonth gets May
				    	
			spaceCounter = ((spaceCounter + dayCounter) % 7);
			dayCounter = 31;
			
		 }
				    
		 else if (monthCounter == 6){
			 
		 	currentMonth = sixthMonth; // currentMonth gets June
				    	
			spaceCounter = ((spaceCounter + dayCounter) % 7);
			dayCounter = 30;
			
		 }
				    
		 else if (monthCounter == 7){ 
			 
		   	currentMonth = seventhMonth; // currentMonth gets July
				    	
		   	spaceCounter = ((spaceCounter + dayCounter) % 7);
		   	dayCounter = 31;	
		   	
		 }
				    
		 else if (monthCounter == 8){
		   	currentMonth = eighthMonth; // currentMonth gets August
				    	
		   	spaceCounter = ((spaceCounter + dayCounter) % 7);
		   	dayCounter = 31;
		   	
		 }
				    
	     else if (monthCounter == 9){
			currentMonth = ninthMonth; // currentMonth gets September
				    	
			spaceCounter = ((spaceCounter + dayCounter) % 7);
			dayCounter = 30;
		    	
		 }
				    
	     else if (monthCounter == 10){
		   	currentMonth = tenthMonth; // currentMonth gets October
				    	
		   	spaceCounter = ((spaceCounter + dayCounter) % 7);
		   	dayCounter = 31;
			    	
		 }
				    
		 else if (monthCounter == 11){
		   	currentMonth = eleventhMonth; // currentMonth gets November
				    	
		   	spaceCounter = ((spaceCounter + dayCounter) % 7);
		   	dayCounter = 30;		    	
				    	
		 }
				    
				    
		 else if (monthCounter == 12){
			 
			currentMonth = twelvethMonth; // currentMonth gets December
				    	
			spaceCounter = ((spaceCounter + dayCounter) % 7);
			dayCounter = 31;
				    			    	
		 }
		 //spaceCounter is assigned to 7 if it is 0		    
		 if (spaceCounter == 0)
		 spaceCounter = 7;
		 
		 //repeats until the twelve months are printed out 	      
	     } while (monthCounter <=  12);
		
		
	   }
		
	   else {	
	  
		  System.out.println("Invalid Input!");
	  
	   }
		
		
		
	}

		
  
  }



}

			    	  
			    	  
			    	  
			   
