package hackerRank;

public class PlusMinus {
	// positive
	// negative
	// zero �Ҽ� 6�ڸ�
	static void plusMinus(int[] arr) {
		double positive = 0;
		double nagative = 0;
		double zero = 0;
		double len = arr.length;
		for(int a : arr) {
			if(a>0)
				++positive;
			else if(a<0)
				++nagative;
			else
				++zero;
		}
		System.out.printf("%.6f\n",positive/len);
		System.out.printf("%.6f\n",nagative/len);
		System.out.printf("%.6f\n",zero/len);
    }
}
