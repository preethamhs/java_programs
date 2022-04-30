package array;

public class SumOf1st3maxNum {

	public static void main(String[] args) {
		int[] arr = { 20, 50, 40, 30, 10 };
		int sum1 = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int i = 0; i < 3; i++) {
			sum1 = sum1 + arr[i];
		}
		System.out.println("Sum of maximum 1st 3 Elements :" + sum1);

	}

}
