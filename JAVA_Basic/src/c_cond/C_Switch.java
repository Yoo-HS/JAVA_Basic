package c_cond;

public class C_Switch {
	public static void main(String[] args) {
		// switch : 값이 같은지만 확인 가능
		String score = "A";

		int coupon = 0;

		switch (score) { // switch(조건)
		case "A": // 조건이 A와 같으면
			coupon = 1000; // 쿠폰은 1000
			break; // 멈추기
		case "B": // B와 같으면
			coupon = 2000; // 쿠폰은 2000
			break; // 멈추기
		case "C": // C과 같으면
			coupon = 3000; // 쿠폰은 3000
			break;
		default: // 그 무엇도 아니면 (if문의 else)
			coupon = 500; // 쿠폰은 500
			break;
		}

		System.out.println("쿠폰금액 : " + coupon);
	}

}
