package mydemos;

public class LargestElement {
	public static void main(String[]args) {
		int arr[]={10,20,5,40};
		int max=arr[0];
		for(int x:arr) if(x>max) max=x;
		System.out.println(max);
	}

}
