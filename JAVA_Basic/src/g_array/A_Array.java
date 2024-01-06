package g_array;

import java.util.Iterator;

public class A_Array {
	public static void main(String[] args) {
		
		// 배열
		int[] std = new int[5]; // int타입 변수 5개를 저장할수있는 배열 생성
		// 배열은 0이 첫번째인덱스
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
	}
}
