/*
  static 키워드로 정의된 메서드를 정적메서드 또는 클래스 메서드라고 한다. 정적메서드는 해당 클래스명으로 직접 접근한다. 
 */

class St02{
	private static int a = 10; //정적변수(클래스변수)
	private int b = 20; //인스턴스 변수
	
	public static void setA(int new_a) {
		a = new_a;
	}
	public static int getA() {
		return a;
	}
}

public class StEx02 {
	public static void main(String[] args) {
		St02.setA(100); // 클래스명.정적메소드()
		System.out.println("a = " + St02.getA());
	}
}
