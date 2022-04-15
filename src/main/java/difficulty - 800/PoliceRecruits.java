import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PoliceRecruits {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Long n = Long.parseLong(br.readLine());
        String[] events = br.readLine().split(" ");

        int crimes = 0;
        int officers = 0;
        for (int i = 0; i < n; i++) {
            Integer x = Integer.parseInt(events[i]);
            if (x > 0) {
                officers += x;
            }
            if (x < 0) {
                if (officers > 0) {
                    officers--;
                } else {
                    crimes++;
                }
            }
        }
        System.out.println(crimes);
    }
}
