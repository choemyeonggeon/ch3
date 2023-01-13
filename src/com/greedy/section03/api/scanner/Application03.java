package com.greedy.section03.api.scanner;

import java.util.Scanner;

public class Application03 {
	public static void main(String[]age) {
		
		/*스캐너 사용 시 주의 사항
		 * 1. next()로 문자열 입력 받은 후 정수, 실수, 논리값 입력 받을 떄
		 * 2. 정수, 실수, 논리값 입력 후 next()혹은 nextLine()으로 입력 받을 떄
		 **/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열을 입력해주세요 : ");
		String str1 = sc.next();
		System.out.println("str1 : " + str1);
		
		System.out.println("숫자를 입력해주세요 : ");
		int num1 = sc.nextInt();
		System.out.println("num1 :" + num1);
		
		sc.nextLine();				//만들어줘서 밑에있는 str의 공간 활용
		
		System.out.println("공백이 있는 문자열을 하나 입력해주세요 : ");
		String str2= sc.nextLine();
		System.out.println("str2 : " +str2);
		
	}

}
