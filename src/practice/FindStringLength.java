package practice;

public class FindStringLength {

	public static void main(String[] args) {
		String[]arr= {"hello","nithi","hai","jjjjj"};
		String max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(max.length()>arr[i].length()) {
				max=arr[i];
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(max.length()==arr[i].length()) {
				System.out.println(arr[i]);
			}
		}

	}

}
