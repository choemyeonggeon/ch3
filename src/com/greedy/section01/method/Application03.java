package com.greedy.section01.method;

public class Application03 {

	public static void main(String[] args) {
		
		//전달인자(argument)와 매개변수(parameter)를 이용한 메소드 호출
		
		/*변수들의 종류
		 * 1. 지역변수
		 * 2. 매개변수
		 * 3. 전역변수(필드)
		 * 4.클래스(static)변수
		 */
		
		//1. 전달인자로 값 전달 테스트
		//호출하려는 매소드의 매게변수 선언부에 미리 선언해둔 자료형과 갯수. 순서가 일치하게 값을 넣어 호출해야 한다.
		Application03 app3 = new Application03();
		app3.textMethod(20);
//		app3.testMethod(20,30); 		//인자로 전달하는 값의 갯수와 매개변수의 갯수가 일치하지 않으면 호출할 수 없다.
//		app3.testMethod("40");			//인자로 전달하는 값의 자료형과 매게변수의 자료형이 일치하지 않으면 호출할 수 없다.
//		app3.textMethod();				//매개변수는 선언되어 있지만 인자로 값을 전달하지 않으면 호출할 수 없다.
	
		//2. 변수에 저장한 값 전달 테스트
		int age = 20;
		app3.textMethod(age);
		
		//3. 자동형변환을 이용해서 값 전달 테스트
		byte byteAge = 10;
		app3.textMethod(byteAge);
		
		
		//4 강제형변환을 이용해서 값 전달 테스트
		long longAge = 80;
		app3.textMethod((int)longAge);
		
		//5. 연산 결과를 이용해서 값 전달을 할 수이 있다.
		app3.textMethod(age * 3);
		
		}

	public void textMethod(int age) {
		System.out.println("당신의 나이는 " + age + "세 입니다.");
		
	}
}
