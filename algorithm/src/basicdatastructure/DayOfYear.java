package basicdatastructure;

import java.util.Scanner;

public class DayOfYear {
	static int[][] mdays = {
			{31,28,31,30,31,30,31,31,30,31,30,31}, //���
			{31,29,31,30,31,30,31,31,30,31,30,31} //����
	};
	
	// ���� year���� �����ΰ�?(���� :1/ ��� :0)
	static int isLeap(int year) {
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
	}
	// ���� y�� m�� d���� �� �� ��� �� ���� ����
	static int dayOfYear(int y, int m, int d) {
		int days = d;
		
		for( int i = 1; i < m; i++) 
			days += mdays[isLeap(y)][i -1];
		return days;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int retry;
		
		System.out.println("�� �� ��� �ϼ��� ���մϴ�.");
		
		do {
			System.out.println("�� : ");
			int year = stdIn.nextInt();
			System.out.println("�� : ");
			int month = stdIn.nextInt();
			System.out.println("�� : ");
			int day = stdIn.nextInt();
			
			System.out.printf("�� �� %d��°�Դϴ�. \n", dayOfYear(year, month, day));
			
			System.out.println("�ѹ��� �ұ��? (1.��/ 2. �ƴϿ�) : ");
			retry = stdIn.nextInt();
		}while(retry == 1 );
	}
}