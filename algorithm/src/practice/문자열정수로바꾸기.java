package practice;

public class 문자열정수로바꾸기 {
    static class Solution {
        static public int solution(String s) {
            return Integer.parseInt(s);
        }
    }

    public static void main(String[] args) {
        System.out.println(Solution.solution("1234"));
    }
}
