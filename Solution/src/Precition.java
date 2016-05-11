
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
