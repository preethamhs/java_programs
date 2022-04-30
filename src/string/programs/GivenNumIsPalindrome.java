package string.programs;

public class GivenNumIsPalindrome {

	public static void main(String[] args) {
		
		int number=123;
		int temp=number;
		int rev=0;
		while(temp>0) {
			int ld=temp%10;
			rev=rev*10+ld;
			temp=temp/10;
		}
        if(number==rev) {
        	System.out.println("it is a palindrome");
        }
        else {
        	System.out.println("it is not palindrome");
		}
	}

}
