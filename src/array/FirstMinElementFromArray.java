package array;

public class FirstMinElementFromArray {

	public static void main(String[] args) {
	    int [] arr= {20,30,50,40,10};
	    for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
        System.out.println("1st Minimum Element from Array :"+arr[0]);
        System.out.println("2nd Minimum Element from Array :"+arr[1]);
        
        System.out.println("1st Maximum Element from Array :"+arr[arr.length-1]);
        System.out.println("1st Maximum Element from Array :"+arr[arr.length-2]);
	}

}
