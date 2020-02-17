package hackerRank;

import org.apache.commons.lang.ArrayUtils;
import sun.security.util.ArrayUtil;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class tutorial {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        int status = 0;
        int point = 0;
        char[] arr = s.toCharArray();
        for(char i : arr){
            ArrayUtils.indexOf(arr, i);
        }
        for(int i = 0; i < n; i++){
            if(String.valueOf(s.charAt(i)) == "U"){
                status++;
                if(status == 0){
                    point++;
                }
            }else{
                status--;
            }
        }
        return point;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] s = scanner.nextLine().split(" ");
        String s1 = null;
        for(int j = 0; j < s.length; j++){
            s1=s1+s[j];
        }

        int result = countingValleys(n, s1);


        scanner.close();
    }
}
