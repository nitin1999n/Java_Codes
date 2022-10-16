package Day9;

public class Insertion_sort {

	public static void main(String[] args) {
		int[] arr= {5,9,8,2,3};
		for(int cnt=1;cnt<arr.length;cnt++) {
			int temp=arr[cnt];
			int j=cnt-1;
			while(j>=0 && temp<arr[j]) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
