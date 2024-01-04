package b_operator;

public class G_Logical {
	public static void main(String[] args) {
		
		// 논리연산자
		boolean a = true;
		boolean b = false;
		
		System.out.println("&& (AND연산) : 둘다 true면 true");
		System.out.println(a && b);
		System.out.println(a && b);
		System.out.println(a && b);
		
		System.out.println("\n|| (OR연산) : 둘중 하나라도 true면 true");
		System.out.println(a || b);
		System.out.println(a || b);
		System.out.println(a || b);
		
		System.out.println("\n! (NOT) : 결과를 반대로");
		System.out.println(!a);
		System.out.println(!b);
		
		int i = 15;
		boolean result = 10 < i && i < 20;
		System.out.println("\n" + result);
	}

}
