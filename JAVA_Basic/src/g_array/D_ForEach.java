package g_array;

public class D_ForEach {
	public static void main(String[] args) {
		
		int[] num = {1, 2, 3, 4, 5};
		
		// 일반 for문
		for(int i = 0; i < num.length; i++) {
			System.out.print(num[i]);
		}
		
		System.out.println();
		
		// 향상된 for문
		for(int number : num) {
			System.out.print(number);
		}
		
		// 증가하는 인덱스값이 필요할때는 for-each 사용불가
	}
}
