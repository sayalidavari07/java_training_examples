package mydemos;

public class Palindrome {
	public static void main(String[]args) {
		int n=122,t=n,rev=0;
		while(n>0){ rev=rev*10+n%10; n/=10; }
		System.out.println(t==rev?"Palindrome":"Not");
	}

}
