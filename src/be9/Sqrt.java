package be9;

public class Sqrt {
	public static double solution(int num) {
		double left = 0;
		double right = num;
		
		while (right - left > 0.01) {
			double mid = (left+right) / 2 ;
			
			if (mid*mid > num) {
				right = mid;
			}else {
				left = mid;
			}
		}
		return (left+right)/2;
	}
	public static void main(String[] args) {
		System.out.println(solution(10));
	}
}

