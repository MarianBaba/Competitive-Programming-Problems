import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AntonAndPolyhedrons {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer n = Integer.parseInt(br.readLine());
        int faces = 0;
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            if (s.startsWith("T")) {
                faces += 4;
            } else if (s.startsWith("C")) {
                faces += 6;
            } else if (s.startsWith("O")) {
                faces += 8;
            } else if (s.startsWith("D")) {
                faces += 12;
            } else {
                faces += 20;
            }
        }
        System.out.println(faces);
    }
}