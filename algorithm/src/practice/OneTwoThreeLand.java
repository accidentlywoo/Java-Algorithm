package practice;

public class OneTwoThreeLand {
    public String solution(int n) {
        String[] num = {"4","1","2"};
        StringBuffer answer = new StringBuffer("");

        while(n > 0){
            answer = answer.insert(0, num[n%3]);
            n = (n - 1) / 3;
        }
        return String.valueOf(answer);
    }
}
class Main{
    public static void main(String[] args) {
        OneTwoThreeLand o = new OneTwoThreeLand();
        System.out.println(o.solution(1203));
    }
}