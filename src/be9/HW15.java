package be9;

public class HW15 {
	
	public static int maxSum(int[] arr) {
		int res = 0;
		int max = 0;
		for (int i = 0; i<arr.length;i++) {
			res+=arr[i];
			if (res < 0) {
				res = 0;
			}else {
				max = Math.max(res, max);
			}
			
		}
		return max;
	}
	
	public static void main(String[] args) {
		int[] arr = {7,-2,-7,4,3,2};
		System.out.println(maxSum(arr));
	}
}
