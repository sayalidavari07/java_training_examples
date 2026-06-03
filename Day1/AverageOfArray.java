package mydemos;

public class AverageOfArray {
	public static void main(String[]args) {
		int arr[]={10,20,30};
		int sum=0;
		for(int x:arr) sum+=x;
		System.out.println(sum/arr.length);
	}

}
