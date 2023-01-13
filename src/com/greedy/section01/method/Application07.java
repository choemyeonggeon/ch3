package com.greedy.section01.method;

public class Application07 {

	public static void main(String[] args) {
	
		/*매개변수와 리턴값 복합 활용
		 * 매개변수도 존재하고 리턴값도 존재하는 매소드를 이용하여 간단한 계산기 만들기 
		 */
		int first = 20;
		int second= 10;
		
		Application07 app7= new Application07();
		System.out.println("두 수를 더한 결과 : " + app7.plusTwoNumbers(first, second));
		System.out.println("두 수를 뺸 결과 :" + app7.minusTwoNumber(first, second));
		System.out.println("두 수를 곱한 결과: "+ app7.multpleTwoNumber(first, second));
		System.out.println("두 수를 나누 몫 : "+app7.divideTwoNumber(first, second));
	}
	/*<pre>
	 * 매개변수로 전달 받은 두수를 더히여 결과값을 반환하는 기능 제공
	 * </pre>
	 * @param first 더하기를 할 첫번쨰 정수
	 * @param second 더하기를 할 두번쨰 정수
	 * @return 매개변수로 전달 받은 두 수를 더한 결과
	 * */
	public int plusTwoNumbers(int first, int second) {
		
		return first + second;
		
	}
	/*<pre>
	 * 매개변수로 전달 받은 두 수를 이용하여
	 * 첫 번쨰 매개변수를 전달받은 정수에서 두 번쨰 매개변수로 전달받은 정수를 뺸 결과값을 반환하는 기능 제공
	 * </pre>
	 * @param first 뺴기를 할 첫번쨰 정수
	 * @param second 뺴기를 할 두번쨰 정수
	 * @return 매개변수로 전달 받은 두 수를 뺸 결과
	 * */
	public int minusTwoNumber(int first, int second) {
		
		return first - second;
	}
	
	
	/*  매개변수로 전달받은 두수를 곱하여 결과 값을  반환하는 기능 제공
	 * </pre>
	 * @param first 곱하기를 할 첫번쨰 정수
	 * @param second 곱하기를 할 두번쨰 정수
	 * @return 매개변수로 전달 받은 두 수를 곱셈 결과
	 * */
	
	public int multpleTwoNumber(int first, int second) {
		
		return first * second;
	}
		
	/*<pre>
	 * 매개변수로 전달 받은 두 수를 이용하여
	 * 첫 번쨰 매개변수로 전달한 정수에서
	 * 두 번쨰 매개변수로 전달한 정수를 나누고 그 몫을 
	 * */
	
	
	
	
	public int divideTwoNumber(int first, int second) {
		
		return first / second;
	}
		
	
	
	}


