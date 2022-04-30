package practice;

public class Occurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {10,50,99,100};
		int max1 = 0; int max2=0;
		
		for (int i = 0; i < a.length; i++) {
		     if(max1<a[i]) {
		    	 max2=max1;
		    	 max1=a[i];
		     }
			if(max2<a[i]&&a[i]<max1) {
				max2=a[i];
			}
		}
		System.out.println(max2);
	}

}
