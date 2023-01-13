package com.greedy.section01.method;

public class Application01 {

	public static void main(String[] args) {
		/* 메소드란?
		 * 메소드는 어떤 특정 직업을 수행하기 위한 명령문의 집합이라고 할 수 있다.
		 * 
		 */
		System.out.println("main() 시작됨...");
		
		Application01 app1 = new Application01();
		app1.methodA();
		
	
		
		
		System.out.println("main() 종료됨...");
	}
	public void	 methodA() {
		
		System.out.println("method() 호출함...");
		
		methodB();
		
		System.out.println("method() 종료됨...");
	}
		
	public void methodB() {
		
		System.out.println("method() 호출함...");
		
		System.out.println("method() 종료됨...");
		
		return;
		
	
	
	}
}
