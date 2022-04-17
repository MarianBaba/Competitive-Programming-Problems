import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AntonAndLetters {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(br.readLine());
        sb.deleteCharAt(0);
        sb.deleteCharAt(sb.length() - 1);
        if (sb.length() > 0) {
            String s = sb.toString();
            String[] letters = s.split(",");
            int counter = 0;
            for (int i = 0; i < letters.length; i++) {
                boolean present = false;
                String x = letters[i].trim();
                for (int j = i + 1; j < letters.length; j++) {
                    if (x.equals(letters[j].trim())) {
                        present = true;
                        break;
                    }
                }
                if (!present) {
                    counter++;
                }
            }
            System.out.println(counter);
        } else {
            System.out.println("0");
        }
    }
}
