import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BoysAndGirls {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int nkids = Integer.parseInt(input[0]);
		int time = Integer.parseInt(input[1]);
		char[] initial = br.readLine().toCharArray();
		while(time != 0) {
			ArrayList<Integer> boysPos = new ArrayList<Integer>();
			for(int i = 0; i < nkids-1; i++) {
				if(initial[i] == 'B' && initial[i+1] == 'G') {
					boysPos.add(i);
				}
			}
			for(int i = 0; i < boysPos.size(); i++) {
				char temp = initial[boysPos.get(i)];
				initial[boysPos.get(i)] = initial[boysPos.get(i)+1];
				initial[boysPos.get(i)+1] = temp; 
			}
			time--;
		}
		for(char c : initial) {
			System.out.print(c);
		}
	}
}
