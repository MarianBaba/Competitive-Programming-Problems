import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Games {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer n = Integer.parseInt(br.readLine());
        int[] h = new int[n];
        int[] g = new int[n];
        int res = 0;
        for (int i = 0; i < n; i++) {
            String[] nums = br.readLine().split(" ");
            h[i] = Integer.parseInt(nums[0]);
            g[i] = Integer.parseInt(nums[1]);
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (h[i] == g[j]) {
                    res++;
                }
            }
        }
        System.out.println(res);
    }
}
