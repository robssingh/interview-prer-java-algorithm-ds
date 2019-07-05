package algorithms;

public class EggDroppingProblem {
	
	/*
	 * Using DP */
	
	static void eggDropping(int floor, int egg) {
		int[][] DP = new int[egg+1][floor+1];
		
		//for e=1 max attemps for each floor is equal to floor
		for(int i=0; i<=floor; i++) {
			DP[1][i] = i;
		}
		
		for(int e=2; e<=egg; e++) {
			for(int f=1; f<=floor; f++) {
				DP[e][f] = Integer.MAX_VALUE;
				for(int k=1; k<=f; k++) {
					int c = 1 + Math.max(DP[e-1][k-1], DP[e][f-k]);
					if(c<DP[e][f])
						DP[e][f]=c;
				}
			}
		}
		
		System.out.println(DP[egg][floor]);
		
	}
}
