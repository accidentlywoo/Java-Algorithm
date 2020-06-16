package hackerRank;

public class BirthdayCakeCandles {
	static int birthdayCakeCandles(int[] ar) {
		int max = ar[0];
		for(int a : ar) {
			if(a > max)
				max = a;
		}
		int result = 0;
		for(int a : ar) {
			if(a == max)
				++result;
		}
		return result;
    }
}
