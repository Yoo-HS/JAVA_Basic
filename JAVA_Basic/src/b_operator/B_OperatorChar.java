package b_operator;

public class B_OperatorChar {

	public static void main(String[] args) {
		
		String a = "안녕하세요. ";
		String b = "저는 1998년생 ";
		String c = "유쌤입니다.";
		
		String result = a + b + c;
		
		// "안녕하세요. 저는 1998년생 유쌤입니다." 출력
		System.out.println("문자열 a,b,c 더하기\n" + result); 

		int i = 27;
		
		System.out.println("문자열과 숫자 더하기\n" + a + b + i +"살 " + c );
		
	}
}
