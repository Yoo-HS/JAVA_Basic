package g_array;

public class C_ArrayDi {
	public static void main(String[] args) {
		
		// 2차원 배열
		/* int[][] arr = new int[2][3]; // 2행 3열 2차원배열 생성
		 * arr[0][0] = 1; // 0행 0열 
		 * arr[0][1] = 2; // 0행 1열 
		 * arr[0][2] = 3; // 0행 2열
		 * arr[1][0] = 4; // 1행 0열 
		 * arr[1][1] = 5; // 1행 1열 
		 * arr[1][2] = 6; // 1행 2열
		 */		
		int[][] arr = { 
				{1, 2, 3}, // 행(row) 
				{4, 5, 6},  // 열(column)
				// {7, 8, 9}
				};
		for(int row = 0; row < arr.length; row++) { // arr.length 는 행의 개수인 2
			for(int column = 0; column < arr[row].length; column++) { // arr[row].length 는 하나의 행에 있는 열의 개수인 3
				System.out.print(arr[row][column] + " ");
			}
			System.out.println(); // 한 행 사이 간격
		}
	}
}
