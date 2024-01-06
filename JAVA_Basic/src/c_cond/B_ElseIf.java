package c_cond;

public class B_ElseIf {
	public static void main(String[] args) {
		// else if : 중복체크를 줄일 수 있음
		int age = 27;

		if (age < 8) { // age가 8보다 작으면
			System.out.println("어린이입니다.");
		} else if (age <= 13) { // age가 8보다 작지 않지만 13이하라면
			System.out.println("초등학생입니다.");
		} else if (age <= 16) { // age가 13이하가 아니지만 16이하라면
			System.out.println("중학생입니다.");
		} else if (age <= 19) { // age가 16이하가 아니지만 19이하라면
			System.out.println("고등학생입니다.");
		} else { // 위의 조건들이 모두 아니라면(age가 20이상이면)
			System.out.println("성인입니다. ");
		}
	}
}
