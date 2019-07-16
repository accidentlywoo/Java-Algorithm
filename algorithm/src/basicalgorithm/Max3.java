package basicalgorithm;

import java.util.Scanner;

public class Max3 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		//System.in은 키보드와 연결된 표준 입력 스트림(standard iput stream)
		
		System.out.println("세 정수의 최댓값을 구합니다.");
		System.out.println("a의 값 : "); 
		int a = stdIn.nextInt();
		System.out.println("b의 값 : ");
		int b = stdIn.nextInt();
		System.out.println("c의 값 : ");
		int c = stdIn.nextInt();
		int max = a;
		if (b > max) max = b;
		if (c > max) max = c;
		
		System.out.println("최댓값은 "+max+"입니다.");
		//int형 범위 -2,147,483,648~2,147,483,647
		/*
		 * 키보드로 숫자와 문자 입력하기
		 * - nextBoolean() : True/False
		 * - nextByte() : byte
		 * - nextShort() : short
		 * - nextInt() : int
		 * - nextLong() : long
		 * - nextFloat() : float
		 * - nextDouble() : double
		 * - next() : String - 스페이스, 줄 바꿈으로 문자구분
		 * - nextLine() : String - 문자열 1줄
		 */
	}
	
}
