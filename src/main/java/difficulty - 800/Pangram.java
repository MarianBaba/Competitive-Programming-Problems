import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Pangram {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer n = Integer.parseInt(br.readLine());
        if (n < 25) {
            System.out.println("NO");
        } else {
            String w = br.readLine().toLowerCase();
            boolean missing = false;
            for (int i = 97; i <= 122; i++) {
                Character c = (char) i;
                if (!w.contains(c.toString())) {
                    missing = true;
                    break;
                }
            }
            if (missing) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}