import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BeautifulYear {

    public static boolean check(char[] y) {
        boolean diff = true;
        for (int i = 0; i < y.length; i++) {
            char digit = y[i];
            for (int j = i + 1; j < y.length; j++) {
                if (digit == y[j]) {
                    diff = false;
                }
            }
        }
        return diff;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer year = Integer.parseInt(br.readLine());
        boolean go = true;
        while (go) {
            year = year + 1;
            char[] y = year.toString().toCharArray();
            go = !check(y);
        }
        System.out.println(year);
    }
}
