package com.greedy.section01.method;

public class Application06 {

	public static void main(String[] args) {

		/*	메소드 리턴값 테스트
		 * 	메소드는 항상 마지막에 return 명령어가 존재한다.
		 * 	return은 자신을 호출한 구문으로 복귀하는 것을 의미한다.
		 * 	복귀할 떄 그냥 복귀를 할 수도 있지만 , 값을 가지고 복귀할 수 도 있다
		 * 	이떄 가지고 가는 값을 리턴값이라고 한다.
		 * 	return값을 변환받기 위해서는 메소드 선언부에 리턴 타입을 명시해주어야 한다.
		 * 	void는 아무 변환값도 가지지 않겠다는 리턴타입에 사용할 수 있는 키워드이다.
		 * 	반환값이 있는 경우 return 구문을 반드시 명시적으로 작성해야 한다.
		 * 	또한 메소드 선언부에 선언한 리턴 타입과 반환값이 자료형은 반드시 일치해야 한다.
		 * 	리턴값은 1개만 반환가능하다
		 */
		
		Application06 app6 = new Application06();
		String returnText = app6.testMethod();

		System.out.println(returnText);
		System.out.println(app6.testMethod());
	}
	
	
	
	/* <pre>
	 * 문자열 형태의 반환값을 확인해보기 위한 메소드
	 * </pre>
	 * @return hello world라는 문자열을 반환
	 * 
	 */
	
	public String testMethod() {
		return "hello world";
}
}
