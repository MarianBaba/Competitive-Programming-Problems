import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CandiesAndTwoSisters {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            Integer a = Integer.parseInt(br.readLine());
            Integer res = a - ((a / 2) + 1);
            System.out.println(res);
        }
    }
}
