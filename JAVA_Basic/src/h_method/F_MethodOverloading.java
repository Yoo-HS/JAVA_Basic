package h_method;

public class F_MethodOverloading {

	// 메소드 오버로딩 : 메소드명은 동일하지만 매개변수타입이 다른 메소드를 여러개 정의
	public static void main(String[] args) {
		// 매개변수 개수가 다른경우
		System.out.println("1번 " + add(1, 2));
		System.out.println("2번 " + add(1, 2, 3));
		
		// 매개변수 타입이 다른경우
		System.out.println(myMethod(3, 4));
		System.out.println(myMethod(3.5, 4));
	}
	
	// 매개변수 개수가 다른경우
	public static double add(int a, int b) {
		System.out.println("첫번째 메서드");
		return a + b;
	}
	public static double add(int a, int b, int c) {
		System.out.println("두번째 메서드");
		return a + b + c;
	}
	
	// 매개변수 타입이 다른경우
	public static double myMethod(int a, int b) {
		System.out.println("다른타입 1");
		return a + b;
	}
	public static double myMethod(double a, int b) {
		System.out.println("다른타입 2");
		return a + b;
	}
}
