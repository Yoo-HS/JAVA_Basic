package e_casting;

public class B_Casting {

	public static void main(String[] args) {

		// 명시적 형변환
		double dVal = 1.5;
		int iVal = 0;
		
		// iVal = dVal; // double -> int는 자동형변환이 불가능하다. (컴파일오류 발생 - double이 int보다 범위가 크기때문)
		iVal = (int) dVal; // 이런식으로 double타입인 dVal 앞에 (int) 를 적어서 명시했으므로 강제로 형변환이 가능
		System.out.println(iVal); // dVal의 값이 1.5이긴하나 int타입으로 형변환했기때문에 소수점을 버리고 1만 출력
		
		// 추가로 형변환을 했다고해서 기존의 변수 값이 변경되지는 않는다.
		
		System.out.println("10.5 = " + 10.5 + ", (int) 10.5 = " + (int) 10.5);
	}
}
