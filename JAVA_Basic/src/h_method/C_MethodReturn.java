package h_method;

public class C_MethodReturn {

	public static void main(String[] args) {
		checkAge(19);
	}
	
	public static void checkAge(int age) {
		if(age <= 19) {
			System.out.println("미성년자입니다.");
			return; // return을 만나면 바로 종료 // 반환타입이 void이기 때문에 return만 적어도됨
		} else {
			System.out.println("성인입니다.");
			return;
		}
	}
	
}
