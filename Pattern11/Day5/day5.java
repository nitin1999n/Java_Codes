package Day5;

import java.util.Scanner;

class day5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
//------------------------------
//		int n=2;
//		int a=9;
//		if(a%2==n-1)
//		{
//			System.out.println("prime");
//		}
//		else
//			System.out.println("not prime");
//---------------------Prime no.----------------
//		int n=scan.nextInt();
//		int i=2;
//		int flag=0;
//		while(i<n) {
//			if(n%i==0) {
//				flag++;
//			}
//			i++;
//		}
//		System.out.print(flag);
//		if(flag==0) {
//		System.out.println("prime");
//		}
//		else
//			System.out.println("not prime");
//-------------------------continue--------------
//		int i=1;
//		while(i<10) {
//			i++;
//			if(i==5) {
//				continue;
//			}
//			System.out.println(i);
//		}
//------------------Break----------------
//		int n=scan.nextInt();
//		int i=2;
//		int flag=0;
//		while(i<n) {
//			if(n%i==0) {
//				flag++;
//				break;
//			}
//			i++;
//		}
//		System.out.println(flag);
//		if(flag==0) {
//		System.out.println("prime");
//		}
//		else
//			System.out.println("not prime");
//----------------sum of digit---------------------
//		int n=111111;
//		int sum=0;
//		while (n!=0) {
//			int r=n%10;
//			sum=sum+r;
//			n=n/10;
//		}
//		System.out.println(sum);
//----------------reverse of a no.-------------
//		int n=1234;
//		int rev=0;
//		while (n!=0) {
//			int r=n%10;
//			rev=rev*10+r;
//			n=n/10;
//		}
//		System.out.println(rev);
//----------------HCF || GCD------------
/*		int n=scan.nextInt(),x=scan.nextInt();    //n=Dividend,x=divisor
		while(n%x!=0) {
			int r=n%x;                            //r=reminder
			n=x;
			x=r;
		}
		System.out.println(x);*/
//----------
//		int n=scan.nextInt();
//		int row=0;
//		int nst=0;
//		while (row<n) {
//			int cst=0;
//			int ncr=1;
//			while (cst<=nst) {
//				System.out.print(ncr+" ");
//				ncr=(ncr*(row-cst))/(cst+1);
//				cst++;
//			}
//			System.out.println();
//			row++;
//			nst++;
//		}
//------------------------
//		int n= scan.nextInt();
//		int d= scan.nextInt();
//		int ans=0;
//		while(n!=0) {
//			int rem=n%10;
//			if(rem==d)
//				ans++;
//			n=n/10;
//		}
//		System.out.println(ans);
	}

}
