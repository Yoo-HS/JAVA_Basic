package f_scanner;

import java.util.Scanner;

public class E_ScannerEx {
	public static void main(String[] args) {
		
		// scanner 예제 - 한개의 숫자를 입력받아 구구단
		Scanner input = new Scanner(System.in);

		System.out.println("출력할 단수를 입력해주세요.");
		int num = input.nextInt();
		
		for(int i = 1; i <= 9; i++) {
			int result =  num * i;
			System.out.println(num + " X " + i + " = " + result);
		}
	}
}
