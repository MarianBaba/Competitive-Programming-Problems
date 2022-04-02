import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BearBigBrother {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] s = br.readLine().split(" ");
		int[] nums = {Integer.parseInt(s[0]), Integer.parseInt(s[1])};
		
		int counter = 0;
		while(nums[0] <= nums[1]) {
			counter++;
			nums[0] *= 3;
			nums[1] *= 2;
		}
		
		System.out.println(counter);

	}

}
