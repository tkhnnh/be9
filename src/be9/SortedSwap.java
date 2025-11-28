package be9;

public class SortedSwap {
	public static boolean solution(int[] A) {
		int N  = A.length;
		int l = 0, r = N-1;
		
		//Check if a number is higher than its next value
		while (l < N -1 && A[l] < A[l+1]) {
			l++;
		}
		if (l == N-1) return true;
		
		
		// find the position to swap
		while (A[r] >= A[l]) {
			r--;
		}
		
		//Swap 1 time
		int temp = A[l];
		A[l] = A[r];
		A[r] = temp;
		
		for (int i = 0; i < N-1;i++) {
			if (A[i] > A[i+1]) {
				return false;
			}
		}
		
				
		return true;
	}
	public static void main(String[] args) {
		int[] A = {1,5,3,3,7};
		int[] B = {1,5,3,3,4};
		int[] C = {1,3,7};
		
		System.out.println(solution(A));
		System.out.println(solution(B));
		System.out.println(solution(C));
		
	}
}
