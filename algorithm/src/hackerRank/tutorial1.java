package hackerRank;

import java.util.Scanner;

public class tutorial1 {
    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        int counter = 1;
        while (sc.hasNextLine()){
            int a = 3;
            String line = sc.nextLine();
            String s = String.valueOf(a);
            System.out.printf(counter+" "+line);
            counter++;
        }
    }
}
