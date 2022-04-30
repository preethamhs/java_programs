package array;

public class FindMaxElementFromStringArray {

	public static void main(String[] args) {
		String [] arr= {"hello","welcome","hai","unittbn"};
		String maxelement = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(maxelement.length()<arr[i].length()) {
				maxelement=arr[i];
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if(maxelement.length()==arr[i].length()) {
				System.out.println(arr[i]);
			}
		}
		//System.out.println(maxelement);

	}

}
