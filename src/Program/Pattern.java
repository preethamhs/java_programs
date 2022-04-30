package Program;

public class Pattern {

	public static void main(String[] args) {
	/*  54321
		5432*
		543**
		54***
		5****
		*****  */
		
		int n=5;
		
		for (int i = n; i>0; i--) {
			for(int j=n; j>0; j--) {
				if(i>=j) {
					System.out.print(i);
				
				}
				else {
					System.out.print(i);
					
				}
			
			}
			System.out.println();
		}

	}

}
