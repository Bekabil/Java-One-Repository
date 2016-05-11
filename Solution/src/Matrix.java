import java.util.Scanner;
/**
 * 
 * @author Bekabil Tolassa
 * 
 * Given a square matrix of size N×N, this program calculate the absolute difference 
 * between the sums of its diagonals.
 * 
 * Input Format
 * The first input contains a single integer, N to denote the size of Matrix. 
 * The next N input denote the matrix's rows, with each line containing 
 * N space-separated integers describing the columns.
 *
 * Output Format
 * the sum of left side diagonal
 * the sum of right side diagonal
 * absolute value of the difference of the two diagonals
 */

public class Matrix {
	private static int size = 3;
	private static int leftDiagonal = 0;
	private static int rightDiagonal = 0;
	private static int[][]	matrix;
	public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of matrix: ");
        size = input.nextInt();
        matrix = new int[size][size];
        
        for(int i = 0; i < size; i++) {
        	System.out.print("Enter elements of matrix: ");
            for(int j = 0; j < size; j++){
                matrix[i][j] = input.nextInt();
            }
        }

        int countUp = 0;
		int countDown = size - 1;
		for (int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				if(i == j) {
					leftDiagonal += matrix[i][j];
				}
				
					do {
						if((i == countUp && j == countDown)) {
							rightDiagonal += matrix[i][j];
							countUp++;
							countDown--;
						}
						break;
					} while (countDown >= 0 && countUp < size);
				
				

			}
		}
		System.out.println();
		System.out.println("sum of left diagonal " + leftDiagonal);
		System.out.println("sum of right diagonal " + rightDiagonal);
		System.out.println("Diagonal difference is " + Math.abs(leftDiagonal - rightDiagonal));
	}

}
