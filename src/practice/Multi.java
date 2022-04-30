package practice;

public class Multi {

	public static void main(String[] args) {
		
		int [] a= {10,11,11};
		
		int [] b=new int [a.length+1];
		
		for(int i:a) {
			b[i]=1;
		}
		
		for(int i=1; i<b.length;i++) {
			if(b[i]==0) {
				System.out.println(b[i]);
			}
		}
		
		

	}

}
