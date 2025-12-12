package be9;

public class HW19 {
	public static int solution(int[] A, int pos) {
		//Find the k-th largest element
		int targetIndex = A.length - pos;
		return quickSelect(A, 0, A.length - 1, targetIndex);
	}
	
	
	private static int quickSelect(int[] A, int left, int right, int k) {
        if (left == right) return A[left];

        int pivotIndex = partition(A, left, right);

        if (k == pivotIndex) {
            return A[k];
        } else if (k < pivotIndex) {
            return quickSelect(A, left, pivotIndex - 1, k);
        } else {
            return quickSelect(A, pivotIndex + 1, right, k);
        }
    }
	
	private static int partition(int[] A, int left, int right) {
		int pivot = A[right];
		int i = left;
		
		for(int j = left; j< right; j++) {
			if (A[j] <= pivot) {
				int swap = A[i];
				A[i] = A[j];
				A[j] = swap;
				i++;
			}
		}
		
		
		int tmp = A[i];
		A[i] = pivot;
		A[right] = tmp;
		return i;
	}
	public static void main(String[] args) {
		int[] A = {11,6,2,8,9,1,12,5,13};
		System.out.println(solution(A, 3));
	}
}
