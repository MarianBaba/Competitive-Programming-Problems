import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FoxAndSnake {
	public static void main(String...strings) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] nums = br.readLine().split(" ");
		Integer n = Integer.parseInt(nums[0]);
		Integer m = Integer.parseInt(nums[1]);
		String[][] tab = new String[n][m];
		int count = 0;
		for(int i = 0; i < n; i++) {
			if(i % 2 == 0) {
				for(int j = 0; j < m; j++) {
					tab[i][j] = "#";
				}	
			} else {
				if(count % 2 == 0) {
					for(int j = 0; j < m - 1; j++) {
						tab[i][j] = ".";
					}
					tab[i][m-1] = "#";
					count++;
				} else {
					for(int j = 1; j < m; j++) {
						tab[i][j] = ".";
					}
					tab[i][0] = "#";
					count++;
				}
			}
		}
		for(String[] row : tab) {
			for(String s : row) {
				System.out.print(s);
			}
			System.out.println("");
		}
	}
}
