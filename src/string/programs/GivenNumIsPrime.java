package string.programs;

public class GivenNumIsPrime {

	public static void main(String[] args) {
		
		int n=3;
		int i=2;
		while(i<n) {
			if(n%i==0) {
				break;
			}
			else {
				i++;
			}
		}
		if(n==i) {
			System.out.println("prime number");
		}
		else {
			System.out.println("not a prime number");
		}

	}

}
