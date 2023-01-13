package com.greedy.section03.api.scanner;

import java.util.Scanner;

public class Application01 {

	public static void main(String[] args) {
		//java.util.Scanner를 이용한 다양한 자료형 값 입력 받기
		//1. Scanner 객체 생성
//		java.util.Scanner sc = new java.util.Scanner(java.lang.System.in);
//		java.util.Scanner sc = new java.util.Scanner(java.lang.System.in);
		Scanner sc = new Scanner(System.in);
		
		/*2. 자료형별 값 입력 받기
		 * 2-1 문자열 입력 받기*/
		
		System.out.println("이름을 입력하세요 : "  );
		String name=sc.nextLine();
		System.out.println("입력하신 이름은 " + name + "입니다.");
	
		
		//2-2 정수값 입력 받기
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		System.out.print("입력하신 나이는" +age +"입니다.");
		
		//2-3. 실수형 값 입력
		System.out.print("키를 입력해주세요 : " );
		double height = sc.nextDouble();
		System.out.println("입력하신 키는" + height + "입니다.");
		
		//논리형 값 입력
		System.out.print("참과 거짓 중에 한가지를 true of false로 입력해주세요");
		boolean isTrue = sc.nextBoolean();
		System.out.println("입력하신 논리 값은 : " + isTrue+"입니다.");
		
		//2-5. 문자열 값 입력
		sc.nextLine();
		System.out.print("아무문자나 입력해주세요:");
		char ch1= sc.nextLine().charAt(0);
		System.out.println("입력하신 문자는"+ch1+"입니다.");
		
	}

}
