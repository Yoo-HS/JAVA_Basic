package h_method;

public class E_MethodCasting {

	public static void main(String[] args) {
		double num = 1.5;
		// printNum(num); // double타입인 num을 int타입에 대입하므로 컴파일 오류 발생
		printNum((int)num); // 명시적 형변환을 통해 double을 int로 1출력
		
		int num2 = 100;
		printNum2(num2); // int타입인 num2를 double타입에 대입하는것은 자동으로 형변환이 됨 (double이 더 크기때문) 100.0 출력
	}
	
	public static void printNum(int n) {
		System.out.println("숫자 : " + n);
		return;
	}
	
	public static void printNum2(double n) {
		System.out.println("숫자 : " + n);
		return;
	}
	
}
