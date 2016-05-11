import java.io.*;
import java.util.*;
/**
 * 
 * @author Bekabil Tolassa
 * 
 * Given an array of N integers, this program finds the sum of its elements?

 * Input Format

 * The first input is an integer, N, denoting the size of the array.
 * The second input is an N space-separated integers representing the array's elements.

 * Output Format
 * This program print the sum of the array's elements as a single integer. 
 *
 */
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int sum = 0;
        int size = 0; 
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter an array size: ");
        size = input.nextInt();
        
        int[] myList = new int[size];
        System.out.print("Enter " + size + " numbers to be added: ");
        for(int i = 0; i < myList.length; i++) {
            
            myList[i] = input.nextInt();
            
        }
        for(int i = 0; i < myList.length; i++) {
            sum = sum + myList[i];
        }
        System.out.print("The sum is " + sum);
    }
}