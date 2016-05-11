
public class Staircase {

	public static void main(String[] args) {
		int max = 6;
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
