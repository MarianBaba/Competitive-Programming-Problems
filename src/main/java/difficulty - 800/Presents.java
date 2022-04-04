import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Presents {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer n = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        int[] presents = new int[n + 1];
        for (int i = 0, j = 1; i < s.length; i++, j++) {
            presents[j] = Integer.parseInt(s[i]);
        }
        int[] res = new int[n + 1];
        for (int i = 1; i < presents.length; i++) {
            res[presents[i]] = i;
        }
        for (int i = 1; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
