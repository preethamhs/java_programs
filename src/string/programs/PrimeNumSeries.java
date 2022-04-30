package string.programs;

public class PrimeNumSeries {

	public static void main(String[] args) {
		
		int limit=100;
		for (int n=1; n<limit; n++) {
			boolean flag=true;
			for(int i=2; i<n;i++) {
				if(n%i==0) {
					flag=false;
					break;
				}
				
			}
			if (flag) {
				System.out.print(n+" ");
				
			}
		}

	}

}
