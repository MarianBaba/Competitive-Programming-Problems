import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Hulk {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int i = 1;
        String s = "I hate that ";
        String t = "I love that ";
        while (i < n) {
            if (i % 2 == 0) {
                sb.append(t);
            } else {
                sb.append(s);
            }
            i++;
        }
        if (n % 2 == 0) {
            sb.append("I love it");
        } else {
            sb.append("I hate it");
        }
        System.out.println(sb);
    }
}
