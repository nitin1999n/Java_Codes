package LeetCode;

public class Sort_colors {

	public static void main(int[] arr) {
		// TODO Auto-generated method stub
		int i=0;
		int j=arr.length-1;
		int k=0;
		while (k<=j) {
			if(arr[k]==0) {
				int temp=arr[i];
				arr[i]=arr[k];
				arr[k]=temp;
			}
			else if(arr[k]==1) {
				k++;
			}
			else {
				int temp=arr[j];
				arr[j]=arr[k];
				arr[k]=temp;
				j--;
			}
		}
	}

}
