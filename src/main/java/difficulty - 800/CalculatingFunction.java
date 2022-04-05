import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CalculatingFunction {
    // ALTERNATIVE SOLUTION IN COMMENTS
    // public static int f(int n) {
    // return (int)Math.pow(-1, n)*n;
    // }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Long n = Long.parseLong(br.readLine());
        // int result = 0;
        // int i = 0;
        // while(i <= n) {
        // result += f(i);
        // i++;
        // }
        // System.out.println(result);
        if (n % 2 == 0) {
            System.out.println(n / 2);
        } else {
            System.out.println(-((n / 2) + 1));
        }
    }
}