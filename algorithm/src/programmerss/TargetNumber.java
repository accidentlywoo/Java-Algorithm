package programmerss;

public class TargetNumber {
    public int solution(int[] numbers, int target) {
        int answer = 0;
        int total = 0;
        char[] oper = new char[] {'+','-'};
        for(int number : numbers) {
        	
        	for(int innerNum : numbers) {
        		if(number > 0) {
        			
        		}
        		number = oper[1]+number; 
        	}
        	total +=number;
        }
        if(total == target)
        	answer++;
        
        return answer;
    }
}