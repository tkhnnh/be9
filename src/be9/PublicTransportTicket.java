package be9;

import java.util.Arrays;

public class PublicTransportTicket {
	public static int solution(int[] A) {
		boolean[] isTravel = new boolean[31];
		Arrays.fill(isTravel, false);
		int minCost;
		int[] minCostThroughDays = new int[31];
		for (int day : A) {
			isTravel[day] = true;
		}
		
		minCostThroughDays[0] = 0; //Redundant
		
		for (int d =1 ; d< 31;d++) {
			if (!isTravel[d]) {
				minCostThroughDays[d] = minCostThroughDays[d-1];//No travel today -> no cost
			}else {
				minCost = minCostThroughDays[d-1]+2; // 1-Day ticket
				minCost = Math.min(minCost, minCostThroughDays[Math.max(0,d-7)] +7); // 7-Day ticket
				minCost = Math.min(minCost, 25); //30-Day ticket
				
				minCostThroughDays[d] = minCost;
			}
		}
		return minCostThroughDays[30];
	}
	
	public static void main(String[] args) {
		int[] A = {1,2,4,5,7,29,30};
		System.out.println(solution(A));
	}
}
