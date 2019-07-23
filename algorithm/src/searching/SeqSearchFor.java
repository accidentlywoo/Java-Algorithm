package searching;

import java.util.Scanner;

public class SeqSearchFor {
	
	static int seqSearch(int[] a, int n, int key) {
		for (int i = 0; i < n; i++)
			if(a[i] == key)
				return i;
		return -1;
	}	

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("��ڼ� : ");
		int num = stdIn.nextInt();
		int[] x = new int[num];
		
		for(int i = 0; i < num; i ++) {
			System.out.println("x[" + i + "] : ");
			x[i] = stdIn.nextInt();
		}
		
		System.out.println("�˻��� �� : ");
		int ky = stdIn.nextInt();
		int idx = seqSearch(x, num, ky); // �迭 x���� Ű ���� ky�� ��Ҹ� �˻�
		
		if(idx == -1)
			System.out.println("�� ���� ��Ұ� �����ϴ�.");
		else
			System.out.println(ky+"��(��) x["+ idx +"]�� �ֽ��ϴ�.");
	}
}
