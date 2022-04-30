package string.programs;

public class Fibonacci {

	public static void main(String[] args) {
		
		int a=0;
		int b=1;
		int limit=100;
		System.out.print(a+" ");
		System.out.print(b+" ");
		for (int  i = 0;  i <limit;  i++) {
			 int c = a+b;
			if(c<100) {
			System.out.print(c+" ");
			a=b;
			b=c;
			}
		}

	}

}
