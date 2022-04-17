import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BuyAShovel {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inp = br.readLine().split(" ");
        Integer k = Integer.parseInt(inp[0]);
        Integer r = Integer.parseInt(inp[1]);

        int i = 1;
        boolean go = true;
        while (go) {
            if (k * i % 10 == 0) {
                System.out.println(i);
                go = false;
                break;
            } else if (((k * i) - r) % 10 == 0) {
                System.out.println(i);
                go = false;
                break;
            } else {
                i++;
            }
        }
    }
}
