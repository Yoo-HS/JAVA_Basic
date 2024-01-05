package d_loop;

public class A_While {
	public static void main(String[] args) {
		
		// while 문
		int count = 0;
		
		while (count < 5) { // count가 5가 될때까지 반복
			count++; // 1씩 증가
			System.out.println("count 1씩증가 " + count);
		}
		
		// 한번 반복될때마다 1씩 증가하는 i값을 더한 합계 while문
		System.out.println("\n한번 반복될때마다 1씩 증가하는 i값을 더한 합계 구하기");
		int sum = 0; // 합계를 저장할 변수
		int i = 1; // 증가하는 i값
		int endNum = 5; // 반복할 수
		
		while (i <= endNum) {
			sum += i; // sum + i
			System.out.println("현재 i값 = " + i + ", " + i + "번째 반복 후 sum값 = " + sum);
			i++; // i값 1증가
		}
		
	}
}
