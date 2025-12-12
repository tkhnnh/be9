package be9;

public class kthsmallest {
	public int solution(int[] arr, int nums) {
		return quickSelect(arr, 0, arr.length-1,nums);
	}
	
	private int quickSelect(int[] arr, int left, int right, int k) {
		if (left == right) return arr[left];
		
		
		int pivotIndex = partition(arr,left,right);
		
		if (k == pivotIndex) {
			return arr[k];
		}else if (k < pivotIndex) {
			return quickSelect(arr, left, pivotIndex-1,k);
			
		}else {
			return quickSelect(arr,pivotIndex+1, right, k);
		}
	}
	
	private int partition(int[] arr, int left, int right) {
		int pivot = arr[right];
		int i = left;
		
		for (int j = left; j < right; j++) {
			if (arr[j] <= pivot) {
				int swap  = arr[i];
				arr[i] = arr[j];
				arr[j] = swap;
				i++;
			}
		}
		int swap = arr[i];
		arr[i] = pivot;
		arr[right] = swap;
		
		return i;
	}
}
