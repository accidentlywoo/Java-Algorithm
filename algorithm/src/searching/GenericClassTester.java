package searching;

public class GenericClassTester {
	static class GenericClass<T>{
		private T xyz;
		GenericClass(T t){ // ������
			this.xyz = t;
		}
		T getXyx() { // xyz�� ��ȯ�մϴ�.
			return xyz;
		}
	}
	
	public static void main(String[] args) {
		//������ ���� �Ķ���Ϳ� String�� �ѱ� ���� �ְ� Integer�� �ѱ� ���� �ֽ��ϴ�.
		GenericClass<String> s = new GenericClass<String>("ABC");
		GenericClass<Integer> n = new GenericClass<Integer>(15);
		System.out.println(s.getXyx());
		System.out.println(n.getXyx());
	}
}
