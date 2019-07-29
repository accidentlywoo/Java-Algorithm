package searching;

import java.util.Scanner;

public class BinSearch {
	/*
	 * 이진 검색 알고리즘은 검색 대상(배열)이 정렬 되어 있음을 가정한다.
	 */
	static int binSearch(int[] a, int n, int key) {
		int pl = 0; // 검색 범위 맨 앞의 인덱스
		int pr = n - 1; // 검색 범위 맨 끝의 인덱스
		
		do {
			int pc = (pl + pr) / 2; // 중앙 요소의 인덱스
			if (a[pc] == key)
				return pc; //검색 성공
			else if (a[pc] < key)
				pl = pc + 1; // 검색 범위를 뒤쪽 반으로 좁힘
			else
				pr = pc - 1; // 검색 범위를 앞쪽 반으로 좁힘
		}while (pl <= pr);
		
		return -1; // 검색 실패
	}
	public static void main(String[] args) {
		Scanner stdIn  = new Scanner(System.in);
		
		System.out.println("요솟수 : ");
		int num = stdIn.nextInt();
		int[] x = new int[num];
		
		System.out.println("오름차순으로 입력하세요.");
		
		System.out.println("x[0] : ");
		x[0] = stdIn.nextInt();
		
		for(int i = 1; i < num; i++) {
			do {
				System.out.println("x[" + i + "] :");
				x[i] = stdIn.nextInt();
			}while (x[i] < x[i - 1]);
		}
		
		System.out.println("검색할 값 : ");
		int ky = stdIn.nextInt();
		
		int idx = binSearch(x, num, ky);
		
		if(idx == -1)
			System.out.println("그 값의 요소가 없습니다.");
		else
			System.out.println(ky + "은(는) x["+ idx + "]에 있습니다.");
		
	}
}
