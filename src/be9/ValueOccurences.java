package be9;

public class ValueOccurences {
	public static int solution(int[] A) {
		int i = 0;
		int n = A.length;
		int cost = 0;
		
		while (i < n) {
			int value = A[i];
			int count = 0;
			while (i< n && value == A[i]) {
				i++;
				count++;
			}
			int keepCost = Math.abs(count-value);
			int removeCost = count;
			
			cost += Math.min (keepCost, removeCost);
			
		}
		return cost;
		
	}
	public static int findNumber(int[] A, int target) {
		int low =0;
		int high = A.length;
		while (low <= high) {
			int mid = (low+high) /2;
			if (A[mid] == target) {
				return mid;
			}else if (A[mid] < target) {
				low = mid +1;
			}else {
				high = mid -1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
//		int[] A = {1,1,3,4,4,4};
		//int[] A = {1,2,2,2,5,5,5,8};
		//int[] A = {1,1,1,1,3,3,4,4,4,4,4};
		int[] A = {10,10,10};
		int[] B = {1,2,3,4,5,6};
 		System.out.println(solution(A));
 		System.out.println(findNumber(B, 2));
	}
}
