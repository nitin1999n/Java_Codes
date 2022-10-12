package pattern;

import java.util.Scanner;
public class selfpractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int i,j=10,row=5;
		i=1;
		while(i<=row) {
			j=1;
			while(j<=i) {
				System.out.print(j+" ");
				j++;
			}
			System.out.println();
			i++; 
		}
	}

}
