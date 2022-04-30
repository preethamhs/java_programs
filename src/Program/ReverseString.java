package Program;

public class ReverseString {

	public static void main(String[] args) {
	
		String s="Hi bangalore";
		
		String[] str = s.split(" ");
		for (int i = str.length-1; i>=0; i--) {
			System.out.print(str[i]+" ");
		}
		

	}

}
