package leetCode;

public class PrincipleOfRecursion {
    private static void printReverse(char[] str){
        helper(0, str);
    }
    private static void helper(int index, char[] str){
        if(str == null || index >= str.length){
            return;
        }
        helper(index +1, str);
        System.out.println(str[index]);
    }
    public void reverseString(char[] s) {
       int left = 0; int right = s.length - 1;
       while(left < right){
           char tmp = s[left];
           s[left++] = s[right];
           s[right--] = tmp;
       }
    }
}
