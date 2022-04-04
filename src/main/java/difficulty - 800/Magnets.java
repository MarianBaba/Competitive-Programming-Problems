import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Magnets {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer mags = Integer.parseInt(br.readLine());
        String[] m = new String[mags];
        Integer groups = 1;
        for (int i = 0; i < mags; i++) {
            m[i] = br.readLine();
        }
        for (int i = 0; i < m.length - 1; i++) {
            if (m[i].equals(m[i + 1])) {
                continue;
            } else {
                groups++;
            }
        }
        System.out.println(groups);
    }
}
