package h_method;

public class B_MethodVoid {
	public static void main(String[] args) {
		
		print1(); // 매개변수가 없는 메서드는 호출할때도 메서드명만 입력하면 됨
		print2();
		
	}
	
	public static void print1() {
		System.out.println("매개변수가 없는 void 메서드1");
		return;
	}
	public static void print2() {
		System.out.println("매개변수가 없는 void 메서드2");
		return;
	}
	
}
