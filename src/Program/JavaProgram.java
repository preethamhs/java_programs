package Program;

public class JavaProgram {

	public static void main(String[] args) {
		
		String s="hello";
		
		char[] s1 = s.toCharArray();
		int count=0;
		for (char c : s1) {
			count++;
		}
          System.out.println("length of given string is" + count);
	}

}
