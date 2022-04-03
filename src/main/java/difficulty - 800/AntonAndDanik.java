import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AntonAndDanik {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int rounds = Integer.parseInt(br.readLine());
        int anton = 0;
        int danik = 0;
        char[] results = br.readLine().toCharArray();
        for (int i = 0; i < rounds; i++) {
            if (results[i] == 'A') {
                anton++;
            } else {
                danik++;
            }
        }
        if (anton == danik) {
            System.out.println("Friendship");
        } else if (anton > danik) {
            System.out.println("Anton");
        } else {
            System.out.println("Danik");
        }
    }
}
