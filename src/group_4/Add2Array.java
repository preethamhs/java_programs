package group_4;

public class Add2Array {

	public static void main(String[] args) {
		int[] a= {1,2,3,5};
		int[] b= {7,8,9,4,1,6};
		int count=a.length;
		if(a.length<b.length) {
			count=b.length;
		}
		for (int i = 0; i < count; i++) {
			try {
				System.out.println(a[i]+b[i]);
			}
			catch (Exception e) {
				if(a.length<b.length) {
					System.out.println(b[i]);
				}
				else {
					System.out.println(a[i]);
				}
			}
		}

	}

}
