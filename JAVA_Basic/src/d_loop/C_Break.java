package d_loop;

public class C_Break {
	public static void main(String[] args) {
		
		// break
		int sum = 0;
		int i = 1;
		
		while (true) { // 조건을 true로 하면 무한반복이 되는데 중간에 break가 있다면 멈춤
			sum += i; // sum = sum + i;
			if(sum > 10) { // sum이 10보다 커진다면
				System.out.println("sum이 10보다 커졌으므로 반복을 종료합니다.");
				break; // 멈추기
			}
			System.out.println("i = " + i + ", sum = " + sum);
			i++;
		}
		
	}
}
