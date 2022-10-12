package Day7;

import java.util.Scanner;

public class Day7 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		// TODO Auto-generated method stub
//		int n=10;
//		for(int i=0;i<=n;i++) {
//			System.out.println(i+" ");
//		}
//=====================
//		int n=10;
//		int i=1;
//		for (;i<=n;i++) {
//			System.out.print(i+" ");
//		}
//================
//		System.out.println("hello");
//		int c=100;
//		sum(); 
//		System.out.println(c);
//	}
//	public static void sub() {
//		int a=10;
//		int b=20;
//		System.out.println(b-a);
//	}
//	public static void sum() {
//		int a=10;
//		int b=20;
//		sub();
	//	System.out.println(a+b);
//	}
//	public static void main(String[] args) {
//		int a=10;
//		int b=20;
//	//	int val=sum(a,b);
//	//	System.out.println(val);
//		System.out.println(sum(a,b));
//	}
//	public static int sum(int x,int y) {
//		int sum=x+y;
//		return sum;
//======================
//	    int n=scan.nextInt();
//		int flag=0;
//		for(int i=2;i<n;i++)
//			if(n%i==0) {
//				flag++;
//			}
//		}
//		System.out.print(flag);
//		if(flag==0) {
//		System.out.println("prime");
//		}
//		else
//			System.out.println("not prime");
//===========prime no.=============
//	int num=13;
//	boolean isp=isprime(num);
//	if(isp==true)
//		System.out.println("is prime");
//	else
//		System.out.println("is not prime");
//	}
//	
//	public static boolean isprime(int num) {
//		boolean flag=true;
//		for (int i=2;i<num;i++) {
//			if(num%i==0) {
//				flag=false;
//				break;
//			}
//		}
//		return flag;
//======================
		int range=13;
		range_of_prime(range);
		}
		
		public static boolean isprime(int num) {
			boolean flag=true;
			for (int i=2;i<num;i++) {
				if(num%i==0) {
					flag=false;
					break;
				}
			}
			return flag;
	}
		public static void range_of_prime(int range) {
			for(int i=2;i<=range;i++) {
				boolean isprime=isprime(i);
				if(isprime) {
					System.out.print(i+" ");
				}
			}
		}
	}


