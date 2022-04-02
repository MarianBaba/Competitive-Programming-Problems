import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SoldiersBananas {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		int k = Integer.parseInt(s[0]); 
		int n = Integer.parseInt(s[1]); 
		int w = Integer.parseInt(s[2]); 
		int cost = 0;
		for(int i = 1; i <= w; i++)  {
			cost += (i*k);
		}
		int borrow = cost - n;
		if(borrow < 0) {
			System.out.println(0);
		} else {
			System.out.println(borrow);	
		}		
	}
}
