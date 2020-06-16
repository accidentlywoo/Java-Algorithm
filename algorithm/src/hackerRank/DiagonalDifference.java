package hackerRank;

import java.util.List;

public class DiagonalDifference {
	public static int diagonalDifference(List<List<Integer>> arr) {
        int arrSize = arr.get(0).size();
        int leftToRight = 0;
        int rightToLeft = 0;
        for(int i = 0; i < arrSize; i ++) {
        	leftToRight += arr.get(i).get(i);
        	rightToLeft += arr.get(i).get(arrSize-1-i);
        }
		return Math.abs(rightToLeft-leftToRight);
    }
	public static void main(String[] args) {
		
	}
}
