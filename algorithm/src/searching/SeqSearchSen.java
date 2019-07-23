package searching;

import java.util.Scanner;

public class SeqSearchSen {
	/*
	 * �����˻�(���ʹ�)
	 * �������� 1, 2�� ��� �Ǵ��Ѵ�. 
	 * ��ڼ��� n�� �迭 a���� key�� ���� ��Ҹ� ���ʹ����� ���� �˻��Ѵ�.
	 */
	static int seqSearchSen(int[] a, int n, int key) {
		int i = 0;
		
		a[n] = key;
		
		while (true) {
			if (a[i] == key)
				break;
			i++;
		}
		return i == n ? -1 : i;
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("��ڼ� : ");
		int num = stdIn.nextInt();
		int[] x = new int[num + 1]; // ��ڼ� num + 1
		
		for( int i = 0; i < num; i++) {
			System.out.println("x["+i+"]:");
			x[i] = stdIn.nextInt();
		}
		
		System.out.println("�˻��� �� : ");
		int ky = stdIn.nextInt();
		
		int idx = seqSearchSen(x, num, ky);
		
		if(idx == -1)
			System.out.println("�� ���� ��Ұ� �����ϴ�.");
		else
			System.out.println(ky+"��(��) x["+ idx +"]�� �ֽ��ϴ�.");
	}
}
