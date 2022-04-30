package interview;

public class Multi {

	public static void main(String[] args) {
		int [] input= {1,1,1,1,1,1,1,1};
		
		int [] reg=new int[input.length+1];
		
		for(int i:input) {
			reg[i]=1; 
		}
		
		for(int i=1;i<reg.length;i++) {
			if(reg[i]==0) {
				System.out.println(i);
			}
		}

	}

}
