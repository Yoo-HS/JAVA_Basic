package d_loop;

public class E_For {
	public static void main(String[] args) {
		
		// for문 : 주로 반복할 수가 정해져있을 경우 사용
		int sum = 0;
		int endNum = 100;
		
		for (int i = 1; i <= endNum; i++) { // i값이 1씩증가하여 endNum값과 같아질때까지 반복
			sum += i; // sum값에 i값 더하기
			System.out.println("현재 sum값은 " + sum + ", 반복횟수 = " + i);
			if (sum > 10) { // sum값이 10보다 커지면
				System.out.println("sum값이 10보다 커졌으므로 종료합니다.");
				break; // 강제 종료
			}
		}
		
	}
}
