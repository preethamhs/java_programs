package group_3;

public class SeparateAlpaNumSpecialChar {

	public static void main(String[] args) {
		String s="ab1@2c$";
		String sp=""; String alpha=""; String num="";
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)>='A'&&s.charAt(i)<='Z'||s.charAt(i)>='a'&&s.charAt(i)<='z') {
				alpha=alpha+s.charAt(i);
			}
			else if(s.charAt(i)>='0'&&s.charAt(i)<='9') {
				num=num+s.charAt(i);
			} 
			else {
		       sp=sp+s.charAt(i);
			}
		
			}
		System.out.println("alphabets="+alpha);
		System.out.println("Numbers="+num);
		System.out.println("Special char="+sp);
		}

	}

