package f_scanner;

import java.util.Scanner;

public class D_ScannerWhile {
	public static void main(String[] args) {
		
		// scanner와 while 같이 사용하기
		Scanner scanner = new Scanner(System.in);
		
		int sum = 0;
		
		while (true) {
			System.out.println("숫자를 입력해주세요. (0을 입력하면 종료됩니다.");
			int num = scanner.nextInt();
			if (num == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			sum += num;
			System.out.println("현재 합계 = " + sum);
		}
		System.out.println("입력한 수의 합계는 " + sum);
		
	}
}
