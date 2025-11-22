package be9;

import java.util.*;

public class FindIntervalInArray {
    public static int solution(int[] A, int L, int R) {
        int n = A.length;
        int need = R - L + 1;
        if (need > n) return -1;

        Map<Integer, Integer> freq = new HashMap<>();
        int distinctFound = 0;
        int left = 0;
        int minLen = Integer.MAX_VALUE;

        for (int right = 0; right < n; right++) {
            int val = A[right];

            if (val >= L && val <= R) {
                freq.put(val, freq.getOrDefault(val, 0) + 1);

          
                if (freq.get(val) == 1) {
                    distinctFound++;
                }
            }

            // Shrink window while valid
            while (distinctFound == need) {
                minLen = Math.min(minLen, right - left + 1);

                int leftVal = A[left];
                if (leftVal >= L && leftVal <= R) {
                    freq.put(leftVal, freq.get(leftVal) - 1);

                    if (freq.get(leftVal) == 0) {
                        distinctFound--;
                    }
                }
                left++;  
            }
        }

        return minLen == Integer.MAX_VALUE ? -1 : minLen;
    }

    public static void main(String[] args) {
        int[] A = {2, 1, 4, 3, 2, 1, 1, 4};
        int L = 2;
        int R = 4;
        System.out.println(solution(A, L, R)); 
    }
}
