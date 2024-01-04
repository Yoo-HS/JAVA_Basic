package a_variable;

public class C_VarNumType {
	public static void main(String[] args) {
		
		// 정수(숫자)
		// 정수는 보통 int로 사용
		int i = 2147483647; // -2,147,483,648 ~ 2,147,483,647
		
		byte b = 127; // -128 ~ 127
		short s = 32767; // -32,768 ~ 32,767
		long l = 9223372036854775807L; // 맨 뒤에 대문자 L권장
		
		// 실수(소수점)
		// 실수는 보통 double 사용(float은 오류가 자주 발생)
		double d = 10.5;
				
		float f = 10.5f; // float는 f를 붙이는게 좋음
		
	}
}
