import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CalculatingFunction {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Long n = Long.parseLong(br.readLine());

        if (n % 2 == 0) {
            System.out.println(n / 2);
        } else {
            System.out.println(-((n / 2) + 1));
        }
    }
}