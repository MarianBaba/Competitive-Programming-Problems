import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Drinks {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Double d = Double.parseDouble(br.readLine());
        String[] drinks = br.readLine().split(" ");
        Integer sum = 0;
        for (int i = 0; i < drinks.length; i++) {
            sum += Integer.parseInt(drinks[i]);
        }
        System.out.println(sum / d);
    }
}
