package hackerRank;

public class MiniMaxSum {
	static void miniMaxSum(int[] arr) {
		long totalArr = 0;
		int max = arr[0];
		int min = arr[0];
		for(int a : arr) {
			totalArr += a;
			if(max < a)
				max = a;
			else if(min > a)
				min = a;
		}
		System.out.print(totalArr-max+" ");
		System.out.print(totalArr-min);
    }
}
