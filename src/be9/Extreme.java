package be9;

public class Extreme {
	public static int solution(int[] A) {
		int maxIndex = 0, minIndex = 0, sum = 0;
		int n = A.length;
		for (int i = 0; i < n;i++ ) {
			if (A[i] > A[maxIndex]) {
				maxIndex = i;
			}
			if (A[i] < A[minIndex]) {
				minIndex = i;
			}
			sum+=A[i];
		}
		int avg = sum/n;
		
		if (Math.abs(avg-A[maxIndex]) > Math.abs(-A[minIndex])){
			return maxIndex;
		}else {
			return minIndex;
		}
	}
	public static void main(String[] args) {
		int[] A = {9,4,-3,-10};
		System.out.println(solution(A));
	}
}
