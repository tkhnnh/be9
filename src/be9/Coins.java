package be9;

public class Coins {
	public static int solution(int[] A) {
		int iniCount = 0;
		int n = A.length;
		for (int i = 0; i < n-1; i++ ) {
			if (A[i] == A[i+1]) {
				iniCount++;
			}
		}
		
		if (iniCount == n-1) return iniCount-1; //Repeated elements in one array (1,1)
		
		
		int max = 0;
		
		for (int i = 0; i<n; i++) {
			int count = 0;
			if (i > 0) {
				if (A[i-1] != A[i]) {
					count++;
				}else {
					count--;
				}
			}
			if (i < n-1) {
				if (A[i] != A[i+1]) {
					count++;
				}else {
					count--;
				}
			}
			max = Math.max(max,count);
		}
		return max+iniCount;
	}
	
	public static void main(String[] args) {
		int[] A = {1,1,1,1,1};
		int[] B = {1,1,0,1,0,0,1,1};
		System.out.println(solution(A));
		System.out.println(solution(B));
	}
}
