package basicalgorithm;

import java.util.Scanner;

public class Median {
	static int med3(int a, int b, int c) {
		
		if (a>= b)
			if (b >= c)
				return b;
				// a= b =c �� �ִ°� �ƴѰ�?
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
		// med3p�� med3������ ȿ���� ��������. ���ϱ�?
		
	}
	
	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);
		
		System.out.println("�� ������ �߾Ӱ��� ���մϴ�.");
		System.out.println("a�� �� : ");
		int a = i.nextInt();
		System.out.println("b�� �� : ");
		int b = i.nextInt();
		System.out.println("c�� �� : ");
		int c = i.nextInt();
		
		System.out.println("�߾Ӱ���"+med3(a,b,c)+"�Դϴ�");
		
	}
}
