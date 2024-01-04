package a_variable; 
/* 패키지는 자바 파일을 구분하기위한 폴더 정도로 이해하면된다. 
 * variable이라는 패키지를 만들었는데 그 안에 들어가는 모든 자바파일 첫줄에
 * package variable; 이라고 선언해주어야함
 * */

public class A_Var1 {

	public static void main(String[] args) {
		
		// 10을 세번 출력해보자
		System.out.println("숫자 10을 직접 입력해서 세번 출력");
		System.out.println(10);
		System.out.println(10);
		System.out.println(10);
		System.out.println();
		
		/* 위의 10을 20으로 바꾼다면 아래처럼 그냥 숫자를 바꿔도 되지만, 만약 1000개가 
		 * 있다면 1000번을 바꿔야한다. */
		System.out.println("숫자10을 20으로 바꿔서 세번 출력");
		System.out.println(20);
		System.out.println(20);
		System.out.println(20);
		System.out.println();
		
		// 변수(변할 수 있는 수)를 선언하면 하나씩 바꿀필요없이 변수 하나만 수정하면 된다.
		System.out.println("int형 변수 a를 선언하여 10으로 초기화 후 세번출력");
		int a; // int형 a 선언
		a = 10; // a의 값을 10으로 초기화
		
		System.out.println(a); // 변수 a의 값인 10을 출력
		System.out.println(a);
		System.out.println(a);
		System.err.println();
		
		// a를 20으로 바꾸면 위에 처럼 숫자를 하나하나 바꿀필요없이 20으로 바뀜
		System.out.println("변수 a의 값을 20으로 바꾼 후 세번 출력");
		a = 20;
		System.out.println(a); // 변수 a의 값인 20을 출력
		System.out.println(a);
		System.out.println(a);
				
	}
}
