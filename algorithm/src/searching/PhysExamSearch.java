package searching;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class PhysExamSearch {
	static class PhyscData{
		private String name;
		private int height;
		private double vision;
		
		// ������
		public PhyscData(String name, int height, double vision) {
			this.name = name;
			this.height = height;
			this.vision = vision;
		}
		
		// ���ڿ��� ��ȯ�ϴ� �޼���( ���� Ȯ�� �� )
		public String toString() {
			return name + " " + height + " " + vision;
		}
		
		// ������������ �����ϱ� ���� comparator
		public static final Comparator<PhyscData> HEIGHT_ORDER = new HeightOrderComparator();
		
		private static class HeightOrderComparator implements Comparator<PhyscData>{
			public int compare(PhyscData d1, PhyscData d2) {
				return (d1.height > d2.height) ? 1:
					   (d1.height < d2.height) ? -1 : 0;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		PhyscData[] x = {
			
			new PhyscData("��as", 140,0.3),
			new PhyscData("3wws", 147,2.0),
			new PhyscData("�̳���", 162,0.3),
			new PhyscData("weqqwe", 164,0.3),
			new PhyscData("wre", 165, 0.43),
			new PhyscData("��ww", 175,1.2),
			new PhyscData("lee", 180,1.3)
		};
		System.out.println("�� cm�� ����� ã�� �ֳ���? : ");
		int height = stdIn.nextInt();
		int idx = Arrays.binarySearch(x, new PhyscData("", height, 0.0), PhyscData.HEIGHT_ORDER
				);
		
		if (idx < 0)
			System.out.println("��Ұ� �����ϴ�.");
		else {
			System.out.println("x[" + idx + "]�� �ֽ��ϴ�.");
			System.out.println("ã�� ������ : " + x[idx]);
		}
		
		
	}
}