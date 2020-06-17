package hackerRank;

import java.util.*;

public class ClimbingTheLeaderboard {
    static int[] climbingLeaderboard(int[] scores, int[] alice) {
        ArrayList scoreList = new ArrayList();
        int[] result = new int[alice.length];
        int i = 0;
        for(int s : scores){
            if(!scoreList.contains(s))
                scoreList.add(s);
        }
        for(int a = 0; a <  alice.length; a++){
            scoreList.add(alice[a]);
            Collections.sort(scoreList, Collections.reverseOrder());

            int idx = scoreList.indexOf(alice[a])+1;
            result[a] = idx;
            scoreList.remove(idx-1);
        }

        return result;
    }

    public static void main(String[] args) {
        climbingLeaderboard(new int[]{100, 90, 90, 80, 75, 60}, new int[]{50, 65, 77, 90, 102});
    }
}
