package interview;

public class AabbYesNo {

	public static void main(String[] args) {
		String s="aabb";
		int count1=1; int count2=0; 
		for (int i = 0; i <s.length(); i++) {
			if(s.charAt(i)==s.charAt(i+1)) {
				count1++;
			}
			else {
				for (int j =i+1; j <s.length(); j++) {
					count2++;	
				}
				break;
			}
			
		}
		if (count1==count2) {
			System.out.println("yes");
		}
		else {
			System.out.println("No");
		}

	}

}
