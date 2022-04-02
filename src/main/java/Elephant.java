import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Elephant {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int dis = Integer.parseInt(br.readLine());
		int steps = 0;	
		int n = 0;
		while(n < dis) {
			n += 5;
			steps++;
		}
		System.out.println(steps);	
	}
}
