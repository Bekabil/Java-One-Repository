/**
 * 
 * @author Bekabil Tolassa
 * 
 * Given an array of integers, this program calculates which fraction of its elements are positive, 
 * which fraction of its elements are negative, and which fraction of its elements are zeroes, respectively. 
 * It prints the decimal value of each fraction on a new line.
 * This program also prints the output with precision specific. 
 * The test cases are scaled to six decimal places. 

 * Input Format

 * The first line of input contains an integer, N, denoting the size of the array.
 * The second line contains N space-separated integers describing an array of numbers.

 * Output Format

 * A decimal representing of the fraction of positive numbers in the array.
 * A decimal representing of the fraction of negative numbers in the array.
 * A decimal representing of the fraction of zeroes in the array.
 *
 */
public class Precition {

	private static int size;
	private	static double posNum = 0;
	private	static double negNum = 0;
	private	static double zeroNum = 0;
	
	public static void main(String[] args) {
		double num = 6;
		int[] myList = {-4, 3, -9, 0, 4, 1};
		size = myList.length;
		for(int i = 0; i < myList.length; i++) {
			if(myList[i] > 0) {
				posNum++;
			}
			if(myList[i] < 0) {
				negNum++;
			}
			if(myList[i] == 0) {
				zeroNum++;
			}
		}
		posNum = posNum / size;
		negNum = negNum / size;
		zeroNum = zeroNum / size;
		
		System.out.printf("%f", posNum);
		System.out.println();
		System.out.printf("%f", negNum);
		System.out.println();
		System.out.printf("%f", zeroNum);

	}

}
