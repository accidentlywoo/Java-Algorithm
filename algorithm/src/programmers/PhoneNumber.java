package programmers;

public class PhoneNumber {
    class Solution {
        public String solution(int[] numbers, String hand) {
            int[] left = {1, 4, 7};
            int leftState = 0;
            int[] right = {3, 6, 9};
            int rightState = 0;
            String answer = "";
            int numbersLen = numbers.length;
            for(int i = 0; i < numbersLen; i++){
                if(numbers[i] == left[0] ||
                numbers[i] == left[1] ||
                numbers[i] == left[2]
                ){
                    leftState = numbers[i];
                    answer = answer+"L";
                }else if(numbers[i] == right[0] ||
                        numbers[i] == right[1] ||
                        numbers[i] == right[2]){
                    rightState = numbers[i];
                    answer = answer+"R";
                }else{ // 가운데 열 등장
                    if(i == 0){
                        if(hand.equals("right")){
                            rightState = numbers[i];
                            answer = answer+"R";
                        }else if(hand.equals("left")){
                            leftState = numbers[i];
                            answer = answer+"L";
                        }
                    }else{
                        if (numbers[i]==2){
                            if(leftState == 1 && rightState == 3){
                                if(hand.equals("right")){
                                    answer = answer+"R";
                                }else{
                                    answer = answer+"L";
                                }
                            }else if(leftState == 1){
                                answer = answer+"L";
                            }else{
                                answer = answer+"R";
                            }
                        }else if (numbers[i]==5){
                            if(leftState == 4 && rightState == 6){
                                if(hand.equals("right")){
                                    answer = answer+"R";
                                }else{
                                    answer = answer+"L";
                                }
                            }else if(leftState == 4){
                                answer = answer+"L";
                            }else{
                                answer = answer+"R";
                            }
                        }else if (numbers[i]==8){
                            if(leftState == 7 && rightState == 9){
                                if(hand.equals("right")){
                                    answer = answer+"R";
                                }else{
                                    answer = answer+"L";
                                }
                            }else if(leftState == 7){
                                answer = answer+"L";
                            }else{
                                answer = answer+"R";
                            }
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
