package Program;

import java.util.HashSet;

public class B {

	public static void main(String[] args) {
		
		int [] arr= {10, 40, 50, 10, 60, 10, 50, 90, 80};
		HashSet<Integer> set=new HashSet<Integer>();
		for(int i=0; i<arr.length;i++) {
			set.add(arr[i]);
		}
		
		for (Integer num : set) {
			int count=0;
			for(int i=0; i<arr.length;i++) {
				if(num==arr[i]) {
					count++;
				}
			}
			System.out.println(num+"===="+count);
		}

	}

}
