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
		 * �޼��带 ������ �� �޼��忡 ���޵Ǵ� ���� �����ϱ� ���� ����(variable)�� �����ϴµ�, �̸� �Ű�����(parameter)�Ǵ� ���� �Ű�����(formal parameter)�� �Ѵ�.
		 * ���� �Ű������� ���μ��� �ϰ� �޼��带 ȣ���� �� ����ϴ� �Ű������� ���� ���μ���� �Ѵ�.
		 * �����ϰ� �����ϸ� �޼��带 ������ ���� �Ű�����
		 * 
		 * �޼��带 ȣ���� ���� ���μ�(�ƱԸ�Ʈ) ��� �����ϸ� �ȴ�.
		 */
	}
}
