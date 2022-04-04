import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InSearchOfEasyProblem {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] op = br.readLine().split(" ");
        boolean easy = true;
        for (int i = 0; i < n; i++) {
            if (op[i].equals("1")) {
                easy = false;
            }
        }
        if (easy) {
            System.out.println("EASY");
        } else {
            System.out.println("HARD");
        }
    }
}
