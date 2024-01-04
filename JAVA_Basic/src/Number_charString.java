
public class Number_charString {

	public static void main(String[] args) {
		
		// 따옴표(")가 없는 숫자는 숫자로 인식
		System.out.println(6+2); // = 8 
		System.out.println(6-2); // = 4
		System.out.println(1.32+4.5); // = 5.82
		System.out.println(6*2); // = 12
		System.out.println(6/2); // = 3
		
		// 따옴표가 있으면 문자로 인식
		System.out.println("3+2"); // 3+2로 출력
		System.out.println("3"+"2"); // 32

		System.out.println("\n"); // \n을 사용하면 줄바꾸기
		
		// 문자열
		System.out.println("안녕하세요.");
		// System.out.println('안녕하세요.'); 문자열을 작은따옴표(')로 감싸면 오류 발생
		System.out.println("저는 1998년생" + "입니다."); // 문자열끼리 더하기
		System.out.println("\"따옴표표시하기\""); // 큰따옴표(")를 표시하고 싶다면 앞에 \
	}

}
