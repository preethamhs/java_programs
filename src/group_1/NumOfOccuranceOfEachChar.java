package group_1;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class NumOfOccuranceOfEachChar {

	public static void main(String[] args) {
		
		String s="hello";
		HashSet<Character>set=new HashSet<Character>();
		//LinkedHashSet<Character> link=new LinkedHashSet<Character>();
		for (int i = 0; i <s.length(); i++) {
			set.add(s.charAt(i));
		}
		for (Character ch : set) {
			int count=0;
			for (int i = 0; i < s.length(); i++) {
				if(ch==s.charAt(i)) {
					count++;
				}
				
			}
			System.out.println(ch+"====="+count);
		}

	}

}
