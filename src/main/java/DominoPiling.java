import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DominoPiling {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] inputs = br.readLine().split(" ");
		int dim = 1;
		boolean flag = true;
		for(int j = 0; j < inputs.length; j++) {
			if(Integer.parseInt(inputs[j]) < 1 || Integer.parseInt(inputs[j]) > 16)  {
				flag = false;
			}
		}
		if(flag) {
			for(int i = 0; i < inputs.length; i++) {
				dim *= Integer.parseInt(inputs[i]);
			}
			System.out.println(dim/2);
		}
	}
}
