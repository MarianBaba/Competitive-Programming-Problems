import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NearlyLuckyNumber {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		Integer counter = 0;	
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == '4' || s.charAt(i) == '7') {
				counter++;
			}
		}
		if(counter.toString().contains("4") || counter.toString().contains("7")) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
