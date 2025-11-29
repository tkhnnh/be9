package be9;


public class SameSumDice {
    public static int solution(int[] A, int[] B) {
        int sumA = 0, sumB = 0;

        for (int a : A) sumA += a;
        for (int b : B) sumB += b;

        if (sumA == sumB) return 0;

        // A should always be the one with smaller sum
        if (sumA > sumB) {
            int[] temp = A;
            A = B;
            B = temp;

            int tmp = sumA;
            sumA = sumB;
            sumB = tmp;
        }

        int diff = sumB - sumA;
        int[] count = new int[7]; // index 1..6

        // possible increases for A
        for (int x : A) {
            int inc = 6 - x;
            if (inc > 0) count[inc]++;
        }

        // possible decreases for B
        for (int x : B) {
            int dec = x - 1;
            if (dec > 0) count[dec]++;
        }

        int times = 0;

        // use biggest improvements first
        for (int change = 6; change >= 1 && diff > 0; change--) {
            while (count[change] > 0 && diff > 0) {
                diff -= change;
                count[change]--;
                times++;
            }
        }

        return diff > 0 ? -1 : times;
    }

    public static void main(String[] args) {
        int[] A = {5};
        int[] B = {1,1,6};
        System.out.println(solution(A,B));
    }
}
