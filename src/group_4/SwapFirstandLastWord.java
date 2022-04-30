package group_4;

public class SwapFirstandLastWord {

	public static void main(String[] args) {
		String s1="welcome to tyss bangalore";
		String[] str = s1.split(" ");
		
		String str1 = str[0];
		str[0]=str[str.length-1];
		str[str.length-1]=str1;
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i]+" ");
		}

	}

}
