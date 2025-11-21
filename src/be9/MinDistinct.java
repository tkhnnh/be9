package be9;


public class MinDistinct {
	public static int solution(int[] A) {
		int counter = 0;
		int N = A.length;
		for (int i=0; i< N-1;i++) {
			for (int j=0; j<N-i-1;j++) {
				if(A[j] > A[j+1]) {
					int temp = A[j];
					A[j] = A[j+1];
					A[j+1] = temp;
				}
			}
		}
		for (int i=0;i<N;i++) {
			int target = i+1;
			counter+= Math.abs(A[i] - target);
		}
		return counter;
	}
	
	public static void main(String[] args) {
		//int[] A = {1,2,1};
		//int[] A = {2,1,4,4};
		int[] A = {6,2,3,5,6,3};
		System.out.println(solution(A));
	}
}
