/**
 * 
 * @author Bekabil Tolassa
 * 
 * Given the required height, this program print a staircase.
 *
 * Input
 * You are given an integer of N depicting the height of the staircase.
 *
 * Output
 * Print a staircase of height N that consists of # symbols and spaces. 
 *
 */
public class Staircase {

	public static void main(String[] args) {
		int max = 10;
		int num = max;
		int min = 1;
		int count = 0;
		for(int i = 1; i <= num; i++) {
			count = i;
			while(min < max) {
				System.out.print(" ");
				min++;
			}
			while(count > 0 && count <= num){
				System.out.print("#");
				count--;
			}
			System.out.println();
			max--;
			min = 1;
		}

	}

}
