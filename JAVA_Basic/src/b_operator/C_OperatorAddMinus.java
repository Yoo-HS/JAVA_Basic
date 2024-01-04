package b_operator;

public class C_OperatorAddMinus {
	public static void main(String[] args) {
		
		// 증감 연산자
		int a = 0;
		
		a = a + 1;
		System.out.println(a); // 1
		
		a = a + 1;
		System.out.println(a); // 2
		
		a = a + 1;
		System.out.println(a); // 3
		
		++a; // a = a + 1; 과 같음
		System.out.println(a);
		
		++a;
		System.out.println(a);
		
		--a; // a = a - 1; 과 같음
		System.out.println(a);
		
		--a;
		System.out.println(a);
		
	}
}
