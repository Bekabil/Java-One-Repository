
public class MilitaryTime {

	public static void main(String[] args) {
		
		String standardTime = "10:00:00AM";
		
		String hour = "0";
		String hour2 = "";
		int hr1 = 0, hr2 = 0;
		int min1 = 0, min2 = 0;
		int sec1 = 0, sec2 = 0;
		
		
		for(int i = 0; i < standardTime.length(); i++) {
			switch (i) {
				case 0:
					hr1 = Character.getNumericValue(standardTime.charAt(0));
					break;
				case 1:
					hr2 = Character.getNumericValue(standardTime.charAt(1));
					
					if(standardTime.charAt(8) != 'A'){
						if(hr1 == 1 && hr2 == 2){
							hour2 = "12";
							break;
						}
						if(hr1 != 0){
							hr2 = hr2 + 10 + 12;
							hour2 += hr2;
						} else {
							hr2 = hr2 + 12;
							hour2 += hr2;
						}
						if(hr2 == 24) {
							hour = "00";
						}
					}
					else {
						if(hr1 == 1 && hr2 == 2) {
							hour = "00";
							break;
						}
						if(hr1 != 0){
							hr2 = hr2 + 10;
							hour2 += hr2;
						} else {
							hr1 = 0;
							hr2 = Character.getNumericValue(standardTime.charAt(1));
							hour2 += hr1;
							hour2 += hr2;
						}
					}
					break;
				case 3:
					min1 = Character.getNumericValue(standardTime.charAt(3));
					break;
				case 4:
					min2 = Character.getNumericValue(standardTime.charAt(4));
					break;
				case 6:
					sec1 = Character.getNumericValue(standardTime.charAt(6));
					break;
				case 7:
					sec2 = Character.getNumericValue(standardTime.charAt(7));	
					
			}

		}
			
			if(hr1 == 1 && hr2 == 2 && standardTime.charAt(8) == 'A')
			System.out.println(hour + ":" + min1 + min2 + ":" + sec1 + sec2);
			else
				System.out.println(hour2 + ":" + min1 + min2 + ":" + sec1 + sec2);
			
	}

}
