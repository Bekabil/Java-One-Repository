
import javax.swing.*;

	/*
	 * Name:	Bekabil Tolassa
	 * Class:	ICS 140 
	 * Project:	This program reads employee's name, number of hours worked in a week,
	 * 			hourly pay, federal tax rate, and state tax rate.
	 * 			This program prints out employee's name, hours worked in a week, pay rate, gross pay, 
	 * 			federal withholding, state withholding, total deduction, and net pay.
	 * 			This program imports javax swing to use dialog boxes and message box for input and out put information
	 * 			This program imports decimal formating object to format and round off double values to two decimal places.
	 * Date:	February 17, 2014.
	 */

//imports class decimal format
import java.text.DecimalFormat; 

	// class payrollGUI
	public class PayRoll {
	
		//main procedure
		public static void main(String[] args)
		{
			
			// payCheckFormat is created of type DecimalFormat, double type outputs be round off to 2 decimal places. 
			DecimalFormat payCheckFormat = new DecimalFormat("##.##");	
			
			//string type variable declaration
			String name;
			String strHrsWork;
			String strHourlyPay;
			String strFedTax;
			String strStateTax;
			String message;
			//double type variable declaration
			double totalHours;
			double hourlyPay;
			double fedTaxRate;
			double stateTaxRate;
			double grossPay;
			double totalDeduction;
			double netPay;
			
			//prompts user for employye's name input
			name = JOptionPane.showInputDialog(null, "Enter employee's name: ", "Employee's Information", JOptionPane.QUESTION_MESSAGE);
			
			
			//prompts user for hours worked in a week input, the input is converted to double and assigned to totalHours
			strHrsWork = JOptionPane.showInputDialog(null, "Enter number of hours worked in a week: ", "Employee's Information", JOptionPane.QUESTION_MESSAGE);
			totalHours = Double.parseDouble(strHrsWork);
			
			//prompts user for hourly pay input, the input is converted to double and assigned to houlyPay
			strHourlyPay = JOptionPane.showInputDialog(null, "Enter hourly pay rate: ", "Employee's Information", JOptionPane.QUESTION_MESSAGE);
			hourlyPay = Double.parseDouble(strHourlyPay);
			
			//prompts user for federal tax withholding rate input, the input is converted to double and assigned to fedTaxRate
			strFedTax = JOptionPane.showInputDialog(null, "Enter federal tax withholding rate: ", "Employee's Information", JOptionPane.QUESTION_MESSAGE);
			fedTaxRate = Double.parseDouble(strFedTax);
			
			//prompts user for state tax withholding rate input, the input is converted to double and assigned to stateTaxRate
			strStateTax = JOptionPane.showInputDialog(null, "Enter state tax withholding rate: ", "Employee's Information", JOptionPane.QUESTION_MESSAGE);
			stateTaxRate = Double.parseDouble(strStateTax);
			
			
			
			//number of hours worked is multiplied by pay rate and assigned to grossPay
			grossPay = totalHours *  hourlyPay;
			
			//gross pay is multiplied by federal tax withholding rate and assigned to fedTaxRate
			fedTaxRate = grossPay * fedTaxRate;
			
			//gross pay is multiplied by state tax withholding rate and assigned to stateTaxRate
			stateTaxRate = grossPay * stateTaxRate;
			
			//sum of federal withholding and stated withholding is assigned to totalDeduction
			totalDeduction = fedTaxRate + stateTaxRate;
			
			//the difference of gross pay and total deduction is assigned to netPay
			netPay = grossPay - totalDeduction;
			 
			
			//formatted and indented employee's pay roll to be printed out to the message dialog box
			
			message = "Employee Name: " + name + 
					"\nHours Worked: " + totalHours + 
					"\nPay Rate: " + hourlyPay + 
					"\nGross Pay: " + payCheckFormat.format(grossPay) +
					"\nDeductions:" +
					"\n    Federal Withholding (20.0%):  $" + payCheckFormat.format(fedTaxRate) + 
					"\n    State Withholiding (9.0%):  $" + payCheckFormat.format(stateTaxRate) +
					"\n    Total Deduction:  $" + payCheckFormat.format(totalDeduction) +
					"\nNet Pay:   $" + payCheckFormat.format(netPay);
			
			//Employee's information entered and calculated pay to be printed out to message box		
			JOptionPane.showMessageDialog(null, message, "Employee's Pay Roll", JOptionPane.INFORMATION_MESSAGE);
		  
		}

	}



