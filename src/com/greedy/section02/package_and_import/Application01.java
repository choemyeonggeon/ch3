package com.greedy.section02.package_and_import;

public class Application01 {

	public static void main(String[] args) {
		com.greedy.section01.method.Calculator calc = new com.greedy.section01.method.Calculator();
		int min = calc.MinNumberOf(30, 20);
		
		System.out.println("30과 20중 더 작은 값은: " + min);
		
		
		//2. static 메소드 호출
		
		int max = com.greedy.section01.method.Calculator.MaxNumberOf(30, 20);
		
		System.out.println("30과 20중 더 큰 값은 : " + max);
	
	
	}

}
