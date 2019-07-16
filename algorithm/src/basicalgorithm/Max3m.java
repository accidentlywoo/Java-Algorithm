package basicalgorithm;

public class Max3m {
	static int max3(int a, int b, int c) {
		int max = a;
		if(b > max)
			max = b;
		if(c > max)
			max = c;
		return max;
		
	}	
	public static void main(String[] args) {
		System.out.println(max3(4,3,2));
		/*
		 * 메서드를 정의할 때 메서드에 전달되는 값을 저장하기 위해 변수(variable)를 선언하는데, 이를 매개변수(parameter)또는 형식 매개변수(formal parameter)라 한다.
		 * 형식 매개변수를 가인수라 하고 메서드를 호출할 때 사용하는 매개변수의 값을 실인수라고 한다.
		 * 간단하게 정리하면 메서드를 정의할 때는 매개변수
		 * 
		 * 메서드를 호출할 때는 실인수(아규먼트) 라고 생각하면 된다.
		 */
	}
}
