package b_operator;

public class F_CompChar {

	public static void main(String[] args) {
		// 문자열 비교
		String str1 = "문자열1";
		String str2 = "문자열2";
		
		boolean result1 = "안녕".equals("안녕"); // 리터럴 비교
		boolean result2 = str1.equals("문자열1"); // 문자열 변수와 리터럴 비교
		boolean result3 = str1.equals(str2); // 문자열 변수 비교
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
		// 문자열 비교에서는 == 을 안쓰는것이 좋음 .equals() 로 비교하기
		
	}
}
