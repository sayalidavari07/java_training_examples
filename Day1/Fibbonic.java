package mydemos;

public class Fibbonic {
	public static void main(String[]args) {
		int a=0,b=1,c,n=10;
		for(int i=1;i<=n;i++){
		 System.out.print(a+" ");
		 c=a+b; a=b; b=c;
		}
	}

}
