package ���ǹ�;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		System.out.print("���̸� �Է����ּ��� >> ");
		Scanner sc = new Scanner(System.in);
//		int age = sc.nextInt();
//		if (age >= 20) {
//			System.out.println("�����Դϴ�");
//
//		}else {
//			System.out.println("�̼������Դϴ�");
//		
//		
//		
//		}
		
		int age = sc.nextInt();
		if (age < 10) {
			System.out.println("10�� �̸��Դϴ�");
		}
		else if (age >= 10 && age < 20) {
			System.out.println("10�� �Դϴ�");
		}
		else if (age >= 20 && age < 30) {
			System.out.println("20�� �Դϴ�");
		}
		else if (age >= 30 && age < 40) {
			System.out.println("30�� �Դϴ�");
		} else {
			System.out.println("30�� �̻��Դϴ�");
		}
	}

}
