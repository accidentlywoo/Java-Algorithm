package basicalgorithm;

import java.util.Scanner;

public class Max3 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		//System.in�� Ű����� ����� ǥ�� �Է� ��Ʈ��(standard iput stream)
		
		System.out.println("�� ������ �ִ��� ���մϴ�.");
		System.out.println("a�� �� : "); 
		int a = stdIn.nextInt();
		System.out.println("b�� �� : ");
		int b = stdIn.nextInt();
		System.out.println("c�� �� : ");
		int c = stdIn.nextInt();
		int max = a;
		if (b > max) max = b;
		if (c > max) max = c;
		
		System.out.println("�ִ��� "+max+"�Դϴ�.");
		//int�� ���� -2,147,483,648~2,147,483,647
		/*
		 * Ű����� ���ڿ� ���� �Է��ϱ�
		 * - nextBoolean() : True/False
		 * - nextByte() : byte
		 * - nextShort() : short
		 * - nextInt() : int
		 * - nextLong() : long
		 * - nextFloat() : float
		 * - nextDouble() : double
		 * - next() : String - �����̽�, �� �ٲ����� ���ڱ���
		 * - nextLine() : String - ���ڿ� 1��
		 */
	}
	
}
