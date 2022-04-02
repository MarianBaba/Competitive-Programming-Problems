import java.io.BufferedReader;
import java.io.InputStreamReader;

public class WrongSubtraction {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] params = br.readLine().split(" ");
		int n = Integer.parseInt(params[0]);
		int k = Integer.parseInt(params[1]);
		
		for(int i = 0; i < k; i++) {
			if(n % 10 == 0) {
				n /= 10;
			} else {
				n -= 1;
			}
		}
		System.out.println(n);
	}
}
