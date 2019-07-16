package basicalgorithm;

import java.util.Scanner;

public class Median {
	static int med3(int a, int b, int c) {
		
		if (a>= b)
			if (b >= c)
				return b;
				// a= b =c 도 있는거 아닌가?
			else if (a <= c)
				return a;
			else
				return c;
		else if (a > c)
			return a;
		else if (b > c)
			return c;
		else
			return b;
	}
	
	static int med3p(int a, int b, int c) {
		if(b >= a && c<= a || (b <= a && c >= a))
			return a;
		else if((a > b && c < b)||(a < b && c > b))
			return b;
		return c;
		// med3p는 med3에비해 효율이 떨어진다. 왜일까?
		
	}
	
	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);
		
		System.out.println("세 정수의 중앙값을 구합니다.");
		System.out.println("a의 값 : ");
		int a = i.nextInt();
		System.out.println("b의 값 : ");
		int b = i.nextInt();
		System.out.println("c의 값 : ");
		int c = i.nextInt();
		
		System.out.println("중앙값은"+med3(a,b,c)+"입니다");
		
	}
}
