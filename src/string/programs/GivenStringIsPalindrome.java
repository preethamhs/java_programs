package string.programs;

public class GivenStringIsPalindrome {

	public static void main(String[] args) {
		
		String s="amma";
		String rev="";
		for (int i =s.length()-1; i>=0; i--) {
			
			rev=rev+s.charAt(i);
		}
		if(s.equalsIgnoreCase(rev)) {
			System.out.println("it is a palindrome");
		}
		else {
			System.out.println("it is not a palindrome");
		}
	}

}
