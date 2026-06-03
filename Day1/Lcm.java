package mydemos;

public class Lcm {
	public static void main(String[]args) {
		int a=12,b=18,max=Math.max(a,b);
		while(true){
		 if(max%a==0 && max%b==0){
		  System.out.println(max);
		  break;
		 }
		 max++;
		}
	}

}
