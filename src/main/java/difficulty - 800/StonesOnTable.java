import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StonesOnTable {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int len = Integer.parseInt(br.readLine());
		char[] stones = br.readLine().toCharArray();
		
		int counter = 0;
		
		if(len <= 50 && len >= 1) {
			for(int i = 0; i < len -1; i++) {
				if(stones[i] == stones[i+1]) {
					counter++;
				}
			}	
			System.out.println(counter);	
		}
	}
}
