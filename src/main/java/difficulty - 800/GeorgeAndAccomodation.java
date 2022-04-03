import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GeorgeAndAccomodation {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer r = Integer.parseInt(br.readLine());
        int counter = 0;
        for (int i = 0; i < r; i++) {
            String[] room = br.readLine().split(" ");
            int inside = Integer.parseInt(room[0]);
            int freespace = Integer.parseInt(room[1]);
            if (inside <= freespace - 2) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
