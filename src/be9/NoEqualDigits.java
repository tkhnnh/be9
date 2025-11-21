package be9;

public class NoEqualDigits {
	public static boolean hasConsecutiveDigits(int num) {
		num = Math.abs(num);
		while(num >=10) {
			int lastDigit = num % 10;
			int secondLast = (num/10) %10;
			if (secondLast == lastDigit) {
				return true;
			}
			num = num /10;
		}
		return false;
		
	}
	public static int solution(int N) {
		N++;
		while(hasConsecutiveDigits(N)) {
			N++;
		}
		return N;
		
	}
	public static void main(String[] args) {
		System.out.println(solution(55));
		System.out.println(solution(1765));
		System.out.println(solution(98));
		System.out.println(solution(44432));
		System.out.println(solution(3298));
	}
}
