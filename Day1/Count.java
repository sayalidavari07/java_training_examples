package mydemos;

public class Count {
    public static void main(String []args) {
    	int n=12345,count=0;
    	while(n>0){ count++; n/=10; }
    	System.out.println(count);
    }
}
