package e_casting;

public class Casting2 {
	public static void main(String[] args) {
		
		
		// 같은 타입끼리의 계산은 같은 타입의 결과
		int div1 = 3 / 2;
		System.out.println(div1); // 1
		
		// 서로 다른 타입의 계산은 큰 범위로 자동 형변환
		double div2 = 3 / 2;
		System.out.println(div2); // 1.0
		
		double div3 = 3.0 / 2;
		System.out.println(div3); // 1.5
		
		double div4 = (double) 3 / 2;
		System.out.println(div4); // 1.5
		
		int a = 3;
		int b = 2;
		double result = (double) a / b;
		System.out.println(result); // 1.5
		
	}
}
