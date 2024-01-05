package d_loop;

public class D_Continue {
	public static void main(String[] args) {
		
		// Continue : 건너뛰기
		int i = 1;
		while (i <= 5) {
			if(i == 3) { // i가 3이되면
				i++; // i 1증가 후 
				continue; // 건너뛰기
			}
			System.out.println(i); // 3빼고 출력됨 
			i++;
		}
		
	}
}
