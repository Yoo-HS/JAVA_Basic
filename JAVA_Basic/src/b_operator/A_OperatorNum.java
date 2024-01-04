package b_operator;

public class A_OperatorNum {
	public static void main(String[] args) {
		
		int a = 5, b = 2;
		
		int sum = a + b; // 5 + 2 = 7
		int diff = a - b; // 5 - 2 = 3
		int mul = a * b; // 5 * 2 = 10
		int div = a / b; // 5 / 2 = 2 int형이기 때문, 0으로 나누는것은 오류
		int mod = a % b; // 5 % 2 = 1
		
		System.out.println("a + b = " + a + b);
		System.out.println("a + b");
		System.out.println("\"a\" + \"b\" =" + "a" + "b");
		System.out.println("sum = " + sum);
		System.out.println("diff = " + diff);
		System.out.println("mul = " + mul);
		System.out.println("div = " + div);
		System.out.println("mod = " + mod);
	}
}
