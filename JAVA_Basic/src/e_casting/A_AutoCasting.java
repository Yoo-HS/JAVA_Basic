package e_casting;

public class A_AutoCasting {
	public static void main(String[] args) {

		// 자동형변환 : 작은것 -> 큰것만 가능
		int iValue = 10;
		long lValue = 0;
		double dValue = 0;
		
		// 작은범위타입에서 큰범위타입으로 대입가능
		lValue = iValue; // int -> long
		System.out.println("int -> long " + lValue);
		
		dValue = iValue; // int -> double
		System.out.println("int -> double " + dValue);
		
		dValue = 20L; // long -> double
		System.out.println("long -> double " + dValue);
		
	}
}
