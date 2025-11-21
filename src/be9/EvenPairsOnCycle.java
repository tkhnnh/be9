package be9;

import java.util.Arrays;

public class EvenPairsOnCycle {
	public static int solution(int[] A) {
		int counter = 0;
		int N = A.length;
		if (N < 2) return 0;
		
		int[] pairity = new int[N];
		boolean[] exist = new boolean[N];
		Arrays.fill(exist, false);
		for (int i = 0; i < N;i++) {
			pairity[i] = A[i] % 2;
		}
		
		for (int i = 0; i < N-1;i++) {
			if( (!exist[i]) && (!exist[i+1]) && (pairity[i] == pairity[i+1])) {
				counter++;
				exist[i] = true;
				exist[i+1] = true;
				
			}
		}
		if ( (!exist[0]) && (!exist[N-1]) && (pairity[0] == pairity[N-1])) {
			counter++;
		}
		return counter;
		
	}
	public static void main(String[] args) {
		int[] A = {4,2,5,8,7,3,7};
		//int[] A = {14,21,16,35,22};
		//int[] A = {5,5,5,5,5,5};
		System.out.println(solution(A));
	}
	
}
