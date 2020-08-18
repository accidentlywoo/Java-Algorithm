package hackerRank;

import java.util.*;

public class ClimbingTheLeaderboard {
    static int[] climbingLeaderboard(int[] scores, int[] alice) {
        int scoresLen = scores.length;
        List<Integer> scoreList = new ArrayList<>();
        scoreList.add(scores[0]);
        int scLen = scoreList.size();
        int aliceLen = alice.length;
        int[] result = new int[aliceLen];
        for(int i = 1; i < scoresLen; i ++){
            if(scores[i-1] !=scores[i])
                scoreList.add(scores[i]);
        }
        System.out.println(scoreList);
        for(int i = 0; i < aliceLen; i++){
            for(int j = 0; j < scLen;j++){
                if(alice[i] > scoreList.get(j)){
                    result[i] = scoreList.indexOf(scores[j])+1;
                    break;
                }else if(alice[i] == scoreList.get(j)){
                    result[i] = scoreList.indexOf(scores[j])+1;
                    break;
                }
                result[i] = scoreList.indexOf(scores[j])+2;
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
