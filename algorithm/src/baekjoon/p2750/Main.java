package baekjoon.p2750;

import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;
        import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws NumberFormatException,IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < length; i++){
            list.add(Integer.parseInt(br.readLine()));
        }
        list.sort(null);
        for(int i = 0; i < length; i++){
            System.out.println(list.get(i));
        }
    }
}
