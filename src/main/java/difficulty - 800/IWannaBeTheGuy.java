import java.io.BufferedReader;
import java.io.InputStreamReader;

public class IWannaBeTheGuy {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer n = Integer.parseInt(br.readLine());

        Integer[] levs = new Integer[n];
        for (int i = 0; i < levs.length; i++) {
            levs[i] = i + 1;
        }

        StringBuilder sb = new StringBuilder(br.readLine());
        String s1 = sb.deleteCharAt(0).toString().trim();

        StringBuilder sb2 = new StringBuilder(br.readLine());
        String s2 = sb2.deleteCharAt(0).toString().trim();

        int c = 0;

        for (int i = 0; i < s1.length(); i++) {
            Integer toFind = levs[i];
            if (s1.contains(toFind.toString())) {
                c++;
            } else if (s2.contains(toFind.toString())) {
                c++;
            } else {
                continue;
            }
        }

        System.out.println(c);

    }
}
