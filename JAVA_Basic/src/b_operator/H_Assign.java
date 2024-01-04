package b_operator;

public class H_Assign {
	public static void main(String[] args) {
		// 대입연산자
		int a = 5;
		a += 3; // a = a + 3;
		System.out.println(a); // 5 + 3 = 8
		
		a -= 2; // a = a -2;
		System.out.println(a); // 8 - 2 = 6
		
		a *= 4; // a = a * 4;
		System.out.println(a); // 6 * 4 = 24
		
		a /= 3; // a = a / 3;
		System.out.println(a); // 24 / 3 = 8
		
		a %= 5; // a = a % 5;
		System.out.println(a); // 8 % 5 = 3
		
	}

}
