package b_operator;

public class D_OperatorAddMinus2 {
	public static void main(String[] args) {
		// 전위 증감
		int a = 1;
		int b = ++a; // a의 값을 먼저 증가시키고, 그 값을 b에 대입
		/* a = a + 1;
		 * b = a; 와 같다. */
		System.out.println(b);
		
		// 후위 증감
		a = 1;
		int c = a++; // 기존의 a값을 c에 먼저 대입 후, a 값 증가
		/* c = a;
		 * a = a + 1; 과 같다. */
		System.out.println("++a = " + b + "\na++ = " + c); // b는 2가 나오고, c는 1이 나옴
		
	}
	
}
