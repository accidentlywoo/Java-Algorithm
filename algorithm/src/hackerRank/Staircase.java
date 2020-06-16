package hackerRank;

public class Staircase {
	static void staircase(int n) {
		String shap = "";
		for(int i = 1; i<=n; i++) {
			shap += "#";
			System.out.printf("%"+n+"s\n",shap);
		}
    }
}
