import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NextRound {
	
//	Input
//	The first line of the input contains two integers n and k (1 ≤ k ≤ n ≤ 50) separated by a single space.
//
//	The second line contains n space-separated integers a1, a2, ..., an (0 ≤ ai ≤ 100), 
//	where ai is the score earned by the participant who got the i-th place. 
//	The given sequence is non-increasing (that is, for all i from 1 to n - 1 the following condition is fulfilled: ai ≥ ai + 1).
//
//	Output
//	Output the number of participants who advance to the next round.
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String firstInputs = br.readLine();
		String secondInputs = br.readLine();
		boolean flag = true;
		String[] nk = firstInputs.split(" ");
		int[] nknums = new int[2];		
		for(int i = 0; i < 2; i++) {
			nknums[i] = Integer.parseInt(nk[i]);
		}
		int n = nknums[0];
		int k = nknums[1];
		if(n < k || n > 50 || k < 1) {
			flag = false;
		}
		String[] scores = secondInputs.split(" ");
		int[] scoreNums = new int[n];
		for(int j = 0; j < scores.length; j++) {
			if(Integer.parseInt(scores[j]) < 0 || Integer.parseInt(scores[j]) > 100) {
				flag = false;
			}
			scoreNums[j] = Integer.parseInt(scores[j]);
		}
		int counter = 0;
		if(flag) {
			int minimum = scoreNums[k-1];
			if(minimum > 0) {
				for(int x = 0; x < scoreNums.length; x++) {
					if(scoreNums[x] >= minimum) {
						counter++;
					}
				}	
			} else if(minimum == 0) {
				for(int x = 0; x < k; x++) {
					if(scoreNums[x] > 0) {
						counter++;
					}
				}
			}
		}
		System.out.println(counter);		
	}
}