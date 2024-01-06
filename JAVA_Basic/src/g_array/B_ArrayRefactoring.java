package g_array;

public class B_ArrayRefactoring {
	public static void main(String[] args) {
		
		// 배열 리팩토링 (리팩토링은 중복을 제거하여 가독성을 높이고, 유지보수를 용이하게 만듬)
		
		/* 이전에 만들었던 배열
		int[] std = new int[5];
		std[0] = 90; // int std1 = 90;
		std[1] = 80; // int std2 = 80;
		std[2] = 70; // int std3 = 70;
		std[3] = 60; // int std4 = 60;
		std[4] = 50; // int std5 = 50;
		
		System.out.println("학생1의 점수 = " + std[0]);
		System.out.println("학생2의 점수 = " + std[1]);
		System.out.println("학생3의 점수 = " + std[2]);
		System.out.println("학생4의 점수 = " + std[3]);
		System.out.println("학생5의 점수 = " + std[4]);
		*/
		
		// 리팩토링
		int[] std = {90, 80, 70, 60, 50}; // 배열 생성과 동시에 초기화 진행
		
		for(int i = 0; i < std.length; i++) {
 			System.out.println("학생" + (i + 1) + "의 점수 = " + std[i]);
 		}
	}
}
