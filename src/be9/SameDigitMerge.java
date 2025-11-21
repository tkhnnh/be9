package be9;

public class SameDigitMerge {
	public static int solution(int[] A) {
		int[] start = new int[10];
		
		for (int i =0; i< A.length;i++) {
			int first = String.valueOf(A[i]).charAt(0) - '0';
			start[first]++; 
		}
		
		int count = 0;
		for (int i = 0; i< A.length;i++) {
			int last = A[i] % 10;
			count+=start[last];
		}
		return count;
	}
	
	public static void main(String[] args) {
		int[] A = {30,12,29,91};
		int[] B = {122,21,21,23};
		System.out.println(solution(A));
		System.out.println(solution(B));
	}
}
