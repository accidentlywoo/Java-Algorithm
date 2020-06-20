package hackerRank;

import java.util.Arrays;

public class TheMaxiimumSubarray {
    static int[] maxSubarray(int[] arr) {
        long subArrayMax = arr[0];
        long maximum = 0;
        int arrLen = arr.length;
        for(int i = 0; i < arrLen; i++){
            int subArray = 0;
            for(int j=i; j < arrLen; j++){
                subArray+=arr[j];
                if(subArray > subArrayMax)
                    subArrayMax = subArray;
            }
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        if(arr[arrLen-1] < 0)
            maximum = arr[arrLen-1];
        else{
            for(int a : arr){
                if(a > 0)
                    maximum += a;
            }
            if(maximum == 0)
                maximum = arr[arrLen-1];
        }
        return new int[]{(int)subArrayMax, (int) maximum};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(maxSubarray(new int[]{-2,-3,-1,-4,-6})));
    }
}
