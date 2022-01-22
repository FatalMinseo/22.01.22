package 조건문;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {

		System.out.print("숫자 입력 : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.print("반올림 수 : ");
		
		if (num % 10 >= 5) {
			System.out.println(num / 10 * 10 + 10);

		} else {
			System.out.println(num / 10 * 10);
		}
		
//		if (num % 10 >= 5) {
//			System.out.println(num + 10 - num % 10);
//
//		} else {
//			System.out.println(num - num % 10);
//		}
		
		
		

	}
}