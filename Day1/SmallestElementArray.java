package mydemos;

public class SmallestElementArray {
	public static void main(String[]args) {
		int arr[]={10,20,5,40};
		int min=arr[0];
		for(int x:arr) if(x<min) min=x;
		System.out.println(min);
	}
	}
