package e_casting;

public class C_Overflow {
	public static void main(String[] args) {
		
		long maxIntVal = 2147483647L; // int 최고값
		long maxIntOver = 2147483648L; // int 최고값 1 초과
		int intVal = 0;
		
		intVal = (int) maxIntVal; // 형변환
		System.out.println(intVal);
		
		intVal = (int) maxIntOver; // int의 최대값을 초과하는 값을 가진 maxIntOver를 int로 변환하면
		System.out.println(intVal); // int의 가장 작은범위로 출력 (오버플로우)
		
	}
}
