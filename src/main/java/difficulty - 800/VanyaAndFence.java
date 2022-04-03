
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class VanyaAndFence {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        Integer n = Integer.parseInt(inputs[0]);
        Integer h = Integer.parseInt(inputs[1]);

        int min = n;

        String[] friends = br.readLine().split(" ");

        for (int i = 0; i < friends.length; i++) {
            if (Integer.parseInt(friends[i]) > h) {
                min++;
            }
        }

        System.out.println(min);

    }
}
