package h_method;

public class D_MethodValue {

	// main의 num과 method1의 num은 완전히 다른 num
	public static void main(String[] args) {
		int num = 5;
		System.out.println("num값 = " + num);
		
		
		System.out.println("메서드 실행 후 num값 = " + methhod1(num));
		System.out.println(num); // 메서드를 실행했다고해서 main의 num값이 변하지는 않음
		
	}
	
	public static int methhod1(int num) {
		num = num *2;
		System.out.println("메서드에서의 num값 = " + num);
		return num;
	}
	
}
