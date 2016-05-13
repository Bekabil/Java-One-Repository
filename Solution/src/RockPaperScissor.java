


	/**
	 * Name:	Bekabil Tolassa
	 * Class:	ICS 140 
	 * Project:	This program prompts user to play a scissor, rock, paper game against the computer
	 * 			This program prompts user to enter 0 for scissor, 1 for rock, and 2 for paper
	 * 			This program imports java swing to use dialog boxes and message box.
	 *			This program uses switch statements and if else conditional statements to evaluate 
	 *			users input against computer's randomly generated value.
	 * Date:	February 25, 2014.
	 */

//imports jabax swing
import javax.swing.*;

//class RockPaperScissor
public class RockPaperScissor {
	
	//main procedure
	public static void main(String[] args) {
		
		// variable declaration
		String strGameOption;
			
		//scissor, rock, and paper are assigned to constant value
		final int scissor = 0;
		final int rock = 1;
		final int paper = 2;
		    
			
		//random number 0, 1, or 2 is generated and assigned to randomNumber
		int randomNumber = (int)(Math.random() * 3);
			
		//prompts user to enter 0 for scissor, 1 for rock, and 2 for paper
		//input is assigned to strGameOption as string value
		strGameOption = JOptionPane.showInputDialog(null, "scissor (0), rock (1), paper (2): ", 
					                               "Welcome to Rock Paper Scissor Game", JOptionPane.QUESTION_MESSAGE);
			
		//the input is converted to integer type and assigned to inGameInput
		int intGameInput = Integer.parseInt(strGameOption);
			
		switch (intGameInput) {
			
			// case of intGameInput = 0 is evaluated
			case 0:
				//prints out the winner after evaluates if computer random number is equal to 0 and user's input is equal to 0
				if(randomNumber == scissor && intGameInput == scissor)
				JOptionPane.showMessageDialog(null, "The computer is scissor. You are scissor. It is a draw ", 
					                          "Rock Paper Scissor Game ", JOptionPane.INFORMATION_MESSAGE);
				   
				//prints out the winner after evaluates if computer random number is equal to 1 and user's input is equal to 0
				if(randomNumber == rock && intGameInput == scissor)
				JOptionPane.showMessageDialog(null, "The Computer is Rock. You are Scissor. The Computer Won!",
								              "Rock Paper Scissor Game ", JOptionPane.INFORMATION_MESSAGE);
					 
				//prints out the winner after evaluates if computer random number is equal to 2 and user's input is equal to 0
				if(randomNumber == paper && intGameInput == scissor)
				JOptionPane.showMessageDialog(null, "The Computer is Paper. You are Scissor. You Won!",
									          "Rock Paper Scissor Game ", JOptionPane.INFORMATION_MESSAGE);
					      
				      break;
			//case of intGameInput = 1 is evaluated	      
			case 1:
				//prints out the winner after evaluates if computer random number is equal to 1 and user's input is equal to 1
				 if(randomNumber == rock && intGameInput == rock)
					JOptionPane.showMessageDialog(null, "The Computer is Rock. You are Rock. It is a draw ", 
							                      "Rock Paper Scissor Game ", JOptionPane.INFORMATION_MESSAGE);
				 
				//prints out the winner after evaluates if computer random number is equal to 0 and user's input is equal to 1
				if(randomNumber == scissor && intGameInput == rock)
				  JOptionPane.showMessageDialog(null, "The Computer is Scissor. You are Rock. You Won!",
							                     "Rock Paper Scissor Game ", JOptionPane.INFORMATION_MESSAGE);
				
				//prints out the winner after evaluates if computer random number is equal to 2 and user's input is equal to 1
				if(randomNumber == paper && intGameInput == rock)
				  JOptionPane.showMessageDialog(null, "The Computer is Paper. You are Rock. The Computer Won!",
							                    "Rock Paper Scissor Game ", JOptionPane.INFORMATION_MESSAGE);
				break;
				
			
		   //case of intGameInput = 2 is evaluated	
		   case 2:
		        //prints out the winner after evaluates if computer random number is equal to 2 and user's input is equal to 2
		        if(randomNumber == paper && intGameInput == paper)
				  JOptionPane.showMessageDialog(null, "The Computer is Paper. You are Paper. It is a draw ", 
						                      "Rock Paper Scissor Game ", JOptionPane.INFORMATION_MESSAGE);		
			
			    //prints out the winner after evaluates if computer random number is equal to 0 and user's input is equal to 2
			    if(randomNumber == scissor && intGameInput == paper)
				JOptionPane.showMessageDialog(null, "The Computer is Scissor. You are Paper. The Computer Won!",
						                     "Rock Paper Scissor Game ", JOptionPane.INFORMATION_MESSAGE);
			
			    //prints out the winner after evaluates if computer random number is equal to 1 and user's input is equal to 2
			    if(randomNumber == rock && intGameInput == paper)
				JOptionPane.showMessageDialog(null, "The Computer is Rock. You are Paper. You Won!",
						                     "Rock Paper Scissor Game ", JOptionPane.INFORMATION_MESSAGE);
				break;
				
			//display message for wrong input	
           default: 
			   JOptionPane.showMessageDialog(null, "Wrong input! Try again...",
                                            "Rock Paper Scissor Game ", JOptionPane.INFORMATION_MESSAGE);
        	 
			System.exit(1);
			
				
				
	   }


	}		


}



