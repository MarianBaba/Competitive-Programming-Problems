import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DivisibilityProblem {

    public static int div(String[] nums) {
        Integer f = Integer.parseInt(nums[0]);
        Integer s = Integer.parseInt(nums[1]);

        if (f % s == 0) {
            return 0;
        } else {
            int x = f % s;
            return s - x;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            String[] nums = br.readLine().split(" ");
            System.out.println(div(nums));
        }
    }
}
