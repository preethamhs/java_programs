package practice;

public class EachElementPrimeOrNot {

	public static void main(String[] args) {
		
		int[] a= {13,49,61,88,89};
		for(int j=0;j<a.length;j++) {
			int n=a[j]; int i=2;
			while(i<=n) {
				if(n%i==0) {
					break;
				}
				else {
					i++;
				}
				
			}
			if(n==i) {
				System.out.println(n+" is a prime number");
			}
			else {
				System.out.println(n+" is not a prime number");
			}
		}

	}

}
