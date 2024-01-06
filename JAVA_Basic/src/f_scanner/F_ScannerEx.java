package f_scanner;

import java.util.Scanner;

public class F_ScannerEx {
	public static void main(String[] args) {
		
		// scanner 예제 - 이름과 나이를 반복해서 입력을 받고, 종료를 입력하면 종료
		Scanner input = new Scanner(System.in);

		while (true) {
			System.out.println("\n\"종료\"를 입력하면 종료됩니다.");
			System.out.println("이름을 입력해주세요.");
			String name = input.nextLine();
				if(name.equals("종료")) {
					System.out.println("종료합니다.");
					break;
				}
			System.out.println("나이를 입력해주세요.");
			int age = input.nextInt();
			
			input.nextLine();
			
			System.out.println("이름은 " + name + "이고, 나이는 " + age + "입니다.");
		}
	}
}
