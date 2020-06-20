package hackerRank;

import java.util.*;

public class ClimbingTheLeaderboard {
    static int[] climbingLeaderboard(int[] scores, int[] alice) {
        int scoresLen = scores.length;
        int[] scoreRank = new int[scoresLen];
        scoreRank[0] = 1;
        int aliceLen = alice.length;
        int[] result = new int[aliceLen];
        for(int i = 1; i < scoresLen; i ++){
            if(scores[i-1]==scores[i])
                scoreRank[i] = scoreRank[i-1];
            else
                scoreRank[i] = scoreRank[i-1]+1;
        }
        Arrays.sort(alice);
        for(int i = 0; i < aliceLen; i++){
            for(int j = 0; j < scoresLen; j++){
                if(alice[i] >= scores[j]){
                    result[i] = scoreRank[j];
                    break;
                }
                result[i] = scoreRank[scoresLen-1]+1;
            }

        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println(
                Arrays.toString(
                        climbingLeaderboard(new int[]{100,100,50,40,40,20,10}, new int[]{5,25,50,120})));
    }
}
