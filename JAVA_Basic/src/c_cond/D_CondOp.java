package c_cond;

public class D_CondOp {
	public static void main(String[] args) {
		
		// 삼항 연산자
		int age = 27;
		// 조건이 true면 앞의 값, 아니면 뒤의 값
		String result = (age >= 20) ? "성인" : "미성년자";
		
		System.out.println(result);
		
		int a = 10;
		int b = 20;
			
		String result2 = (a > b) ? "a" : "b";
		System.out.println("a와 b중 숫자가 더 큰 것은 " + result2);
		
		int x = 10; // 짝수인지 구분할 값
		// x를 2로 나누었을때 나머지가 0이면 짝수, 아니면 홀수
		String result3 = (x % 2 == 0) ? "짝수" : "홀수";
		System.out.println("x의 값은 " + result3 + "입니다.");
	}

}
