package LeetCode;

public class Rotate_Array {

	public static void rotate(int[] nums, int k) {
		// TODO Auto-generated method stub
		 k=k% nums.length;
		 reverse(nums,0,nums.length-1);
		 reverse(nums,0,k-1);
		 reverse(nums,k,nums.length-1);
	}
	public static void reverse(int[] nums, int lo,int hi) {
		while(lo<hi) {
			int temp=nums[lo];
			nums[lo]=nums[hi];
			nums[hi]=temp;
			lo++;
			hi--;
		}
	}

}
