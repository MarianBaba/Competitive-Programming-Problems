import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PanoramixPrediction {

    public static boolean checkPrime(int n) {
        boolean prime = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                prime = false;
            }
        }
        return prime;
    }

    public static int nextPrime(int n) {
        boolean found = false;
        int x = n + 1;
        while (!found) {
            for (int i = 2; i < x; i++) {
                if (x % i == 0) {
                    x++;
                    break;
                }
                if (i == x - 1) {
                    found = true;
                }
            }
        }
        return x;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        if (checkPrime(Integer.parseInt(inputs[1]))) {
            if (nextPrime(Integer.parseInt(inputs[0])) == Integer.parseInt(inputs[1])) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else {
            System.out.println("NO");
        }
    }
}
