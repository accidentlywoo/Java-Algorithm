package searching;

class Id{
	private static int counter = 0;
	private int id;
	
	// 생성자
	public Id() {id = ++counter;}
	
	// 아이디를 반환하는 인스턴스 메서드
	public int getId() {return id;}
	
	// counter를 반환하는 클래스 메서드
	public static int getCounter() {return counter;}
}
public class IdTester {
	public static void main(String[] args) {
		Id a = new Id(); 
		Id b = new Id();
		
		System.out.println("a의 아이디 : "+ a.getId());
		System.out.println("b의 아이디 : "+ b.getId());
		
		System.out.println("부여한 아이디의 개수 : " + Id.getCounter());
	}
	/*
	 * 인스턴스 메소드 호출 시 : 클래스형 변수 이름.메서드 이름
	 * 클래스 메서드 호출 시 : 클래스 이름.메서드 이름
	 */
}
