package practice;

public class 모의고사 {
    public int[] solution(int[] answers) {
        int ansLen = answers.length;
        int[] answer = {};
        int[] answerCount = new int[3];

        for(int i = 0; i < 3; i++){
            int flag = 0;
            for(int j = 0; j < ansLen; j++){
                if(answer[j] ==answers[j]){
                    flag++;
                }
            }
            if(flag != 0){
                answerCount[i] = flag;
            }
        }
        int max = 0;
        int mid = 0;
        int min = 0;
        for(int z = 0; z < answerCount.length; z++){
            if(answerCount[z]!=0){
                if(max < answerCount[z]){
                    max = answerCount[z];
                }
                if(min > answerCount[z]){
                    min = answerCount[z];
                }
                mid = answerCount[z];
            }
        }
        if(max > 0){
            answer = new int[3];
            answer[2] = max;
        }
        else if (mid > 0)
            answer[1] = mid;
        else if(min > 0)
            answer[0] = min;
        return answer;
    }
}
class main{
    public static void main(String[] args) {

    }
}