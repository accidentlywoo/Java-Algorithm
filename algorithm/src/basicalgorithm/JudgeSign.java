package basicalgorithm;

import java.util.Scanner;

public class JudgeSign {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요.");
		int n = stdIn.nextInt();
		
		if(n > 0)
			System.out.println("이 수는 양수입니다.");
		else if (n < 0)
			System.out.println("이 수는 음수입니다.");
		else
			System.out.println("이 수는 0입니다.");
	}
	/*
	 * 연산자 a>b에서 연산자는 > 이고 피연산자는 a,b이다.
	 * 
	 * 삼항 연산자 a?b:c -> a가 True이면 b, a가 False이면 c
	 */
}
