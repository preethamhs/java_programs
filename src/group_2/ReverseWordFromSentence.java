package group_2;

public class ReverseWordFromSentence {

	public static void main(String[] args) {
		
		String s="welcome to india welcome to mandya";
		String[] str = s.split(" ");
		for(int i=str.length-1;i>=0;i--) {
			System.out.println(str[i]);
		}

	}

}
