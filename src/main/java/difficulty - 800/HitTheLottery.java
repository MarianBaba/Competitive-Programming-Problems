import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HitTheLottery {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int bills = 0;
        while (n >= 100) {
            n -= 100;
            bills++;
        }
        while (n >= 20) {
            n -= 20;
            bills++;
        }
        while (n >= 10) {
            n -= 10;
            bills++;
        }
        while (n >= 5) {
            n -= 5;
            bills++;
        }
        while (n > 0) {
            n -= 1;
            bills++;
        }
        System.out.println(bills);
    }
}
