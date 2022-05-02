import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TheatreSquare {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        Long n = Long.parseLong(inputs[0]);
        Long m = Long.parseLong(inputs[1]);
        Long a = Long.parseLong(inputs[2]);

        if (a == 1) {
            System.out.println(n * m);
        } else {
            Long c1 = 0L; // long variable
            while (n > 0) {
                n -= a;
                c1++;
            }
            Long c2 = 0L;
            while (m > 0) {
                m -= a;
                c2++;
            }
            Long res = c1 * c2;
            System.out.println(res);
        }
    }
}
