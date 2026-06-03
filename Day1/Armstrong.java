package mydemos;

public class Armstrong {
   public static void main(String[]args) {
	   int n=153,t=n,sum=0;
	   while(n>0){
	    int d=n%10;
	    sum+=d*d*d;
	    n/=10;
	   }
	   System.out.println(t==sum?"Armstrong":"Not");
   }
}
