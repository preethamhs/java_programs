package practice;

public class NumIsPrime {

	public static void main(String[] args) {
		int n=4;
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
			System.out.println("palindrome");
		}else {
			System.out.println("not palindrome");
		}

	}

}
