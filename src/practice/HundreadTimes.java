package practice;

public class HundreadTimes {
    public static void test(int s) {
    	
    	System.out.println(s+" Preethu");
    	s++;
    	if(s>100) {
    		return;
    	}
    	test(s);
    	
    }
	public static void main(String[] args) {
		
		test(1);

	}

}
