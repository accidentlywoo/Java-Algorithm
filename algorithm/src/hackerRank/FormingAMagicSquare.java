package hackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FormingAMagicSquare {
	static int formingMagicSquare(int[][] s) {
		int[] sort = new int[9];
		List<Integer> match = Arrays.asList(1,2,3,4,5,6,7,8,9);
		int index = 0;
		int result = 0;
		for(int[] item : s) {
			for(int i : item) {
				if(sort[index]==i) {
					match.add(i); 
				}
			}
		}
		return result;
    }
}
