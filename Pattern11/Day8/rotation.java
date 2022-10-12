package Day8;
import java.util.Scanner;
public class rotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scan= new Scanner(System.in);
	System.out.println(rotate(1234,2));
	
		
	}
	public static int rotate(int n,int rot) {
		int count=count(n);
		int ans=n;
		rot=rot%count;
		if (rot<0) {
			rot+=count;
		}
		for(int i=0;i<rot;i++) {
			int rem=n%10;
			ans=(rem*(int)Math.pow(10,count-1))+(n/10);
			n=ans;
		}
		return ans;
	}
	public static int count(int n) {
		int count=0;
		while (n!=0) {
			count++;
			n=n/10;
			}
		return count;
		}

}
