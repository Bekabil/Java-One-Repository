import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int sum = 0;
        int size = 0; 
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter array size: ");
        size = input.nextInt();
        
        int[] myList = new int[size];
        System.out.print("Enter a number: ");
        for(int i = 0; i < myList.length; i++) {
            
            myList[i] = input.nextInt();
            
        }
        for(int i = 0; i < myList.length; i++) {
            sum = sum + myList[i];
        }
        System.out.print(sum);
    }
}