package b_operator;

public class E_Comp {

	public static void main(String[] args) {
		int a = 2;
		int b = 3;
		
		System.out.println(a == b); // a와 b의 값이 같은가? false
		System.out.println(a != b); // a와 b의 값이 다른가? true
		System.out.println(a > b); // a가 b보다 큰가? false
		System.out.println(a <= b); // a가 b보다 작거나 같은가? true
		
		boolean result = a == b; // 이런식으로 변수에도 대입가능
		System.out.println(result); // false
	}
}
