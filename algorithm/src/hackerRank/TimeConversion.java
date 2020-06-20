package hackerRank;

import java.util.Arrays;

public class TimeConversion {
    static String timeConversion(String s) {
        String result = "";
        String splitsString = s.substring(s.length()-2,s.length());
        String[] splitstime = s.split("\\D");
        if(splitsString.equals("PM")){
            if(splitstime[0].equals("12"))
                result = splitstime[0];
            else
                result = String.valueOf((Integer.parseInt(splitstime[0])+12));
            for(int i = 1; i < 3; i++){
                result+=":"+splitstime[i];
            }
        }else{
            if(splitstime[0].equals("12"))
                splitstime[0]="00";
            result = splitstime[0];
            for(int i = 1; i < 3; i++){
                result+=":"+splitstime[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(timeConversion("12:45:54PM"));
    }
}
