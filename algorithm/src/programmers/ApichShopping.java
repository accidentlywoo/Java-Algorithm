package programmers;

import java.util.ArrayList;

public class ApichShopping {
    class Solution {
        public int[] solution(String[] gems) {
            ArrayList<String> gemsKinds = new ArrayList<>();
            for(String gem : gems){
                for(String g : gemsKinds){
                    if(gem == g)
                        break;
                    gemsKinds.add(gem);
                }
            }

            int[] answer = {};
            return answer;
        }
    }
}
