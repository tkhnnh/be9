package be9;



import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Max3PersonSeats {
	public static int solution(int N,String S) {

		
		Set<String> occupied = new HashSet<>(Arrays.asList(S.split(" ")));
		int available = 0;
		
		for (int i = 1; i <= N;i++) {
			if(!occupied.contains(i+"A") && !occupied.contains(i+"B") && !occupied.contains(i+"C")) {
				available++;
			}
			if (!occupied.contains(i+"H") && !occupied.contains(i+"J") && !occupied.contains(i+"K")) {
				available++;
			}
			
			boolean defFree = !occupied.contains(i+"D") && !occupied.contains(i+"E") && !occupied.contains(i+"F");
			boolean efgFree = !occupied.contains(i+"G") && !occupied.contains(i+"E") && !occupied.contains(i+"F");
			
			if (defFree || efgFree) {
				available++;
			}
		}
		return available;
		
	}
	public static void main(String[] args) {
		String S = "1A 2F 1C";
		String S1 = "1A 3C 2B 40G 5A";
		System.out.println(solution(40, S1));
	}
}
