package searching;

import java.util.Scanner;

public class SeqSearch {
/*
 * 선형 검색
 *  요소가 직선 모양으로 늘어선 배열에서의 검색은 원하는 키 값을 갖는 요소를 만날 때까지 맨 아ㅠ부터 순서대로 요소를 검색
 *  조건 1 : 검색할 값을 발견하지 못하고 배열의 끝을 지난 경우
 *  조건 2 : 검색할 값과 요소를 발견한 경우
 */
	static int seqSearch(int[] a, int n, int key) {
		int i = 0;
		
		while(true) {
			if(i == n)
				return -1;
			if(a[i] == key)
				return i;
			i++;
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("요솟수 : ");
		int num = stdIn.nextInt();
		int[] x = new int[num];
		
		for(int i = 0; i < num; i ++) {
			System.out.println("x[" + i + "] : ");
			x[i] = stdIn.nextInt();
		}
		
		System.out.println("검색할 값 : ");
		int ky = stdIn.nextInt();
		int idx = seqSearch(x, num, ky); // 배열 x에서 키 값이 ky인 요소를 검색
		
		if(idx == -1)
			System.out.println("그 값의 요소가 없습니다.");
		else
			System.out.println(ky+"은(는) x["+ idx +"]에 있습니다.");
	}
}
