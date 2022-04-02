import java.io.BufferedReader;
import java.io.InputStreamReader;

public class WordCapitalization {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] toCap = br.readLine().toCharArray();
		String s;
		if(toCap[0] <= 122 && toCap[0] >= 97) {
			toCap[0] -= 32;
			s = new String(toCap);
		} else {
			s = new String(toCap);
		}
		System.out.println(s);
	}
}
