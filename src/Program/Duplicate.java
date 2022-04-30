package Program;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Duplicate {

	public static void main(String[] args) {
		// [10,12,15,7,10,14,15,19,25,30,15] ->[12,7,14,19,25,30]
		
		int [] arr= {10,12,15,7,10,14,15,19,25,30,15};
		int [] arr1=new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr1.length; j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[i]);
					ArrayList<Integer> a=new ArrayList<Integer>();
					a.add(arr[i]);
				}
			}
		}
		

	}

}
