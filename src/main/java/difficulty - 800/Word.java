import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Word {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		
		int lower = 0;
		int upper = 0;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i) <= 122 && s.charAt(i) >= 97) {
				lower++;
			} else {
				upper++;
			}
		}
		
		if(lower == upper || lower > upper) {
			System.out.println(s.toLowerCase());
		} else {
			System.out.println(s.toUpperCase());
		}
		
	}

}
