package d_loop;

import java.util.Iterator;

public class F_Nested {
	public static void main(String[] args) {
		
		// 중첩반복문으로 구구단 만들기
		
		for(int i = 1; i <= 9; i++) { // 구구단은 9단까지 있으므로 i는 1부터 9까지증가
			System.out.println("\n" + i + "단");
			for(int j = 1; j <= 9; j++) { // 구구단이므로 j는 1부터 9까지 증가
				System.out.println(i + " X " + j + " = " + i * j);
			}
		}
		System.out.println("\n구구단 끝~");
		
		System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-");
		int row = 5; // 반복할 횟수
		
		for (int i = 1; i <= row; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
