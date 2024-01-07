package h_method;

public class A_Method {
	public static void main(String[] args) {
		
		// 메서드
		/*
		int a = 1;
		int b = 2;
		System.out.println(a + b);
		int sum = a + b;
		System.out.println(sum);
		
		int x = 10;
		int y = 20;
		System.out.println(x + y);
		int sum2 = x + y;
		System.out.println(sum2); */
		System.out.println(add(5, 20)); // 메서드를 호출하여 실행한 값을 출력
		System.out.println(add(1, 20));
	}
	
	public static int add(int a, int b) { // 메서드 선언
		/* public : 다른클래스에서도 접근가능 // static : 객체를 생성하지않고 호출가능한 정적 메서드
		// int : 반환타입 // 메서드의 이름 // (int a, int b) : 메서드를 호출할때 전달할 입력값, 매개변수(파라미터) */
		System.out.println(a + " + " + b + " 의 값을 구하는 메서드 실행 ");
		int sum = a + b;
		return sum; // 메서드 실행결과 반환
	}
}
