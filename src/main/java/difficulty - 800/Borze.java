import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Borze {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length();) {
            if (s.charAt(i) == '.') {
                sb.append("0");
                i++;
            } else if (s.charAt(i) == '-' && s.charAt(i + 1) == '.') {
                sb.append("1");
                i += 2;
            } else if (s.charAt(i) == '-' && s.charAt(i + 1) == '-') {
                sb.append("2");
                i += 2;
            }
        }
        System.out.println(sb.toString());
    }
}