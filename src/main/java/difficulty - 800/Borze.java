import java.io.BufferedReader;
import java.io.InputStreamReader;

public class YoungPhysicist {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer rows = Integer.parseInt(br.readLine());
        int firstCol = 0;
        int secondCol = 0;
        int thirdCol = 0;
        for (int i = 0; i < rows; i++) {
            String[] row = br.readLine().split(" ");
            firstCol += Integer.parseInt(row[0]);
            secondCol += Integer.parseInt(row[1]);
            thirdCol += Integer.parseInt(row[2]);
        }
        if (firstCol == 0 && secondCol == 0 && thirdCol == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
