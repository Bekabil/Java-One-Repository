/**
 * Name:	Bekabil Tolassa
 * Class:	ICS 140
 *          This program uses scanner object to read input from user.
 * Project:	This program reads long type number, extract and add the digits.
 * 			This program uses method to for extracting digits and summing up.
 * 			The total of the digits will be displayed to the console.
 */
//object scanner is imported
import java.util.Scanner;

//class SumDigits
public class SumUpDigits {

    //main procedure
    public static void main(String[]
        args) {

        //input is create as Scanner object
        try(Scanner input = new Scanner(System. in )) {

            //Prompt the user for input
            System.out.print("Enter sequence of number to be added:  ");

            //long type input is read and assigned to variable dividend
            long dividend = input.nextLong();

            //method sumDigits are called, value dividend is passed
            int sum = sumDigits(dividend);

            //print out the sum returned value by method
            System.out.print("The sum of digits " + dividend + " is " + sum);

        }
    }
    //method sumDigits
    public static int sumDigits(long dividend) {

        //local variable declaration 
        long sum = 0;
        long remainder = 0;
        long quotient = 0;
        final long DIVISOR = 10;

        //as long as dividend is greater than or equal to DIVISOR, repeat the while loop
        while (dividend >= DIVISOR) {

            //using the % operator, divides dividend to DIVISOR and assign the remainder to variable remainder. 	 
            remainder = dividend % DIVISOR;

            //using the / operator, divides dividend to DIVISOR and assign the quotient to variable quotient.
            quotient = dividend / DIVISOR;

            //dividend is assigned with new value quotient.
            dividend = quotient;

            //sum is accumulating addition of its previous value and remainder 
            sum = sum + remainder;

            //if dividend is less than DIVISOR, sum = sum + dividend
            if (dividend < DIVISOR)

                sum = sum + dividend;
        }

        //sum is casted to integer type and returned to the caller
        return (int)(sum);
    }
    
}

