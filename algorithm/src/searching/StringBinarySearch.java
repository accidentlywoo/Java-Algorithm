package searching;

import java.util.Arrays;
import java.util.Scanner;

public class StringBinarySearch {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		String[] x = {
			"aasdas", "dfagdsd"	
		};
		
		System.out.println("���ϴ� Ű���带 �Է��ϼ��� : ");
		String ky = stdIn.next();
		
		int idx = Arrays.binarySearch(x, ky);
		
		if( idx < 0)
			System.out.println("��� Ű���尡 �����ϴ�.");
		else
			System.out.println("�ش� Ű����� x[" + idx + "]�� �ֽ��ϴ�.");
	}
}
