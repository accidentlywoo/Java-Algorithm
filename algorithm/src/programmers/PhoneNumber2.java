package programmers;

public class PhoneNumber2 {
    class Solution {
        public String solution(int[] numbers, String hand) {
            // left 1, 4, 7
            // right 3, 6, 9
            // mid 2, 5, 8
            String answer = "";

            String leftState = "*";
            String rightState = "#";
            for(int i : numbers){
                if(i == 1|| i == 4 || i== 7 ){
                    leftState = String.valueOf(i);
                    answer+="L";
                }else if(i == 3|| i == 6 || i== 9 ){
                    rightState = String.valueOf(i);
                    answer+="R";
                }else if(i == 2|| i == 5 || i== 8 || i== 0){
                    if(leftState.equals("*") && rightState.equals("#")){
                        if(hand.equals("left")){
                            leftState = String.valueOf(i);
                            answer+="L";
                        }else if(hand.equals("right")){
                            rightState = String.valueOf(i);
                            answer+="R";
                        }
                        //2일때 - 1, 5, 3
                        // 5일때 - 2, 4, 6, 8
                        // 8일때 - 5, 7, 9, 0
                        // 0일때 - 8
                    }else if(leftState.equals("*")){
                        if(i == 0){
                            leftState = String.valueOf(i);
                            answer+="L";
                        }else{
                            rightState = String.valueOf(i);
                            answer+="R";
                        }
                    }else if(rightState.equals("#")){
                        if(i == 0){
                            rightState = String.valueOf(i);
                            answer+="R";
                        }else{
                            leftState = String.valueOf(i);
                            answer+="L";
                        }
                    }else{
                        if(Integer.parseInt(leftState)+2 == Integer.parseInt(rightState)){
                            if(hand.equals("right")){
                                rightState = String.valueOf(i);
                                answer+="R";
                            }else if(hand.equals("left")){
                                leftState = String.valueOf(i);
                                answer+="L";
                            }
                        }else if(leftState.equals("0")){
                            if(Math.abs(i-Integer.parseInt(rightState)) > 1){

                            }
                            //Math.abs(i-Integer.parseInt(leftState))
                        }
                    }
                }
            }
            return answer;
        }
    }

    public static void main(String[] args) {

    }
}
