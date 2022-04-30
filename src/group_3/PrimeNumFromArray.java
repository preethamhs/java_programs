package group_3;

public class PrimeNumFromArray {

	public static void main(String[] args) {
		int[] a= {2,4,5,7,8};
		int n; 
		for (int i = 0; i < a.length; i++) {
			 n=a[i]; int j=2;
			while(j<=n) {
				if(n%j==0) {
					break;
				}
				else {
					j++;
				}
			}
			if(n==j) {
				System.out.println(n+"is prime");
			}
			else {
				System.out.println(n+"is not prime");
			}
		}

	}

}
