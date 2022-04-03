import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Translation {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder s = new StringBuilder(br.readLine());
        s = s.reverse();
        String s2 = br.readLine();
        if (s.toString().equals(s2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
