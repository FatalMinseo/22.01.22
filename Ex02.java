package 조건문;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		System.out.print("나이를 입력해주세요 >> ");
		Scanner sc = new Scanner(System.in);
//		int age = sc.nextInt();
//		if (age >= 20) {
//			System.out.println("성인입니다");
//
//		}else {
//			System.out.println("미성년자입니다");
//		
//		
//		
//		}
		
		int age = sc.nextInt();
		if (age < 10) {
			System.out.println("10살 미만입니다");
		}
		else if (age >= 10 && age < 20) {
			System.out.println("10대 입니다");
		}
		else if (age >= 20 && age < 30) {
			System.out.println("20대 입니다");
		}
		else if (age >= 30 && age < 40) {
			System.out.println("30대 입니다");
		} else {
			System.out.println("30대 이상입니다");
		}
	}

}
