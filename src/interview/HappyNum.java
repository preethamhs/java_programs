package interview;

public class HappyNum {

	public static void main(String[] args) {

		int temp = 91;

		while (temp > 9) {
			int sum = 0;
			while (temp > 0) {
				int ld = temp % 10;
				sum = sum + (ld * ld);
				temp = temp / 10;
			}
			temp = sum;
		}
		if (temp == 1) {
			System.out.println("happy");
		} else {
			System.out.println("unhappy");
		}
	}

}
