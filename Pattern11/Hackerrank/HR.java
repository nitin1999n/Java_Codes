package Hackerrank;
import java.util.Scanner;

class HR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
//---------------Pattern Number Ladder-------------------
		
	/*  int n=scan.nextInt();
		int row=1;
		int nst=1;
		int num=1;
		while(row<=n) {
			int cst=1;
			while(cst<=nst) {
				System.out.print(num+"  ");
				cst++;
				num++;
			}
		System.out.println();
		row++;
		nst++;
		}
		*/
//-----------------fibonacci-------------
//		int count = scan.nextInt();
//		int num1 = 0;
//		int num2 = 1;
//        System.out.print("");
//
//        int i=1;
//        while(i<=count)
//        {
//            System.out.print(num1);
//            int sumOfPrevTwo = num1 + num2;
//            num1 = num2;
//            num2 = sumOfPrevTwo;
//            i++;
//        } 
//
//		int n=5;
//		int nst=1;
//		int row=1;
//		int num=0;
//		while (row<=n) {
//			int cst=1;
//			while (cst<=nst)
//			 {System.out.print(row+" ");
//				cst++;
//			}
//			if (num<n)
//			row++;
//			System.out.println();
//			if(row<=n)
//				nst++;
//			else
//				nst--;
//		}
//----------------Pattern InvertedHourGlass-----------
		int n=5;
		int row=0;
		int nst=n;
		int nsp=n-1;
		while (row<=(2*n)) {
            int cst=5;
			while (cst>=nst) {
				System.out.print(cst);
				cst--;
			}
//			int csp=5;
//			while(csp<=nsp) {
//				System.out.print(" ");
//				csp++;
//			}
			System.out.println();
			if(row<n) {
				nst--;
			    nsp++;}
			else {
				nst++;
				nsp--;
			}
			row++;

		}
//===========================
//		int n=5;
//		int row=1;
//		int nst=1;
//		int nsp=n-1;
//		while (row<=n) {
//			int csp=1;
//			while (csp<=nsp) {
//				System.out.print("  ");
//				csp++;
//			}
//			int cst=1;
//			while (cst<=nst) {
//				System.out.print(cst+" ");
//				cst++;
//			}
//			System.out.println();
//			row++;
//			nst++;
//			nsp--;
//		}
//================Pattern with Zeros
//		int n=5;
//		int row=1;
//		int nst=1;
//		while(row<=n) {
//			int cst=1;
//			while(cst<=nst) {
//				System.out.print(cst+" ");
//				cst++;
//			}
//			System.out.println();
//			row++;
//			nst++;
//		}
//=======================
//	        int n = scan.nextInt();
//	        int row=1;
//	        int nst=1;
//	        int nsp=n-2;
//	        while(row<=n)
//	        {
//	            int csp=1;
//	            while(csp<=nsp)
//	            {
//	                System.out.print("  ");
//	                csp++;
//	            }
//	            int cst=1;
//	            while(cst<=nst)
//	            {
//	                System.out.print("* ");
//	                cst++;
//	            }
//	            System.out.println();
//	            if(row<n)
//	            {
//	                nst+=2;
//	                nsp--;
//	            }
//	            else
//	            {
//	                nst-=2;
//	                nsp++;
//	            }
//	            row++;
//	        }
//=================Hollow Rhombus Pattern
//		int n=scan.nextInt();
//		int row=1;
//		int nsp=n-1;
//		while(row<=n) 
//		{
//			int csp=1;
//			while (csp<=nsp) {
//				System.out.print(" ");
//				csp++;
//			}
//			int cst=1;
//			while(cst<=n) 
//			{if (row==1 || row==n) {
//				System.out.print("x");
//			}else {
//				if(cst==1 || cst==n) {
//					System.out.print("x");
//					}
//				else
//					System.out.print(" ");
//			}
//			cst++;
//
//			}
//			row++;
//			System.out.println();
//			nsp--;
//		}
//=================
//		int n=5;
//		int row=1;
//		int nst1=1;
//		int nsp=2*n-3;
//		int nst2=1;
//		while(row<=n){
//			int cst1=1;
//			int csp=1;
//			int cst2=1;
//			while(cst1<=nst1){
//				System.out.print("* ");
//				cst1++;
//			}
//			while(csp<=nsp){
//				System.out.print("  ");
//				csp++;
//			}
//			while(cst2<=nst2){
//				System.out.print("* ");
//				cst2++;
//			}
//			nst1++;
//			nsp-=2;
//			if(row<n-1)
//			nst2++;
//			row++;
//			System.out.println();
//		}
		
	}

}
