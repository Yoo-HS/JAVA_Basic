package f_scanner;

import java.util.Scanner;

public class C_Scanner {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("첫번째 숫자를 입력해주세요.");
		int num1 = scanner.nextInt();

		System.out.println("두번째 숫자를 입력해주세요.");
		int num2 = scanner.nextInt();
		
		if (num1 > num2) {
			System.out.println("둘중 더 큰 숫자는 " + num1);
		} else if (num1 < num2) {
			System.out.println("둘중 더 큰 숫자는 " + num2);
		} else {
			System.out.println("두 숫자는 같습니다.");
		}
	
	}
}
