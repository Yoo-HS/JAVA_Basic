package f_scanner;

import java.util.Scanner;

public class A_Scanner {
	public static void main(String[] args) {
		
		// 스캐너
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요. ");
		String str = scanner.nextLine(); // 입력한 값을 String으로, 입력타입은 동일해야됨
		System.out.println("입력한 문자열 : " + str); // 출력

		System.out.print("숫자를 입력하세요. ");
		int iVal = scanner.nextInt(); // 입력한 값을 int로
		System.out.println("입력한 숫자 : " + iVal); // 출력

		System.out.print("실수를 입력하세요. ");
		double dVal = scanner.nextDouble(); // 입력한 값을 double로
		System.out.println("입력한 실수 : " + dVal); // 출력
		
	}
}
