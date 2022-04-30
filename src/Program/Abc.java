package Program;

public class Abc {

	public static void main(String[] args) {
		
		String s="abc_def_hj";
		
		String s1=s.replace("_", "@");
		
		char ch=(char)(s1.charAt(0)-32);
		System.out.print(ch);
		for (int i = 1; i <s1.length(); i++) {
			if(s.charAt(i)=='_') {
			  System.out.print("@"+(char)(s.charAt(i+1)-32));
			  i=i+1;
			}
			else {
				System.out.print(s.charAt(i));
			}
		}

	}

}
