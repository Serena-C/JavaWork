package com.condition.controller;

import java.util.Scanner;

public class ConditionController {
	
	Scanner sc = new Scanner(System.in);

	public void basicIf() {

		int a = 10;
		if(a > 5) {
			System.out.println("true�� ���");
		}

		System.out.println("Ƽ�Ϲ�ȣ: ");
		int ticket = sc.nextInt();
		if (ticket == 777) {
			System.out.println("�����Ǿ����ϴ�.");
			System.out.println("�����ϼ���.");
		}

		System.out.println("����� ����");
		int age = sc.nextInt();
		if (age <= 19) {
			int inter = age - 20;
			System.out.println("�̼����Դϴ�. ������������! " + inter + "�� �Ŀ� ������.");
		}
		
		System.out.println("���� Ȥ�� �Ĺ��� �Է��ϼ���.");
		String str = sc.next();
		if(str.equals("����")) {
			System.out.println("�����̸� ���"); 
		}
		
		System.out.println("����: ");
		int age1 = sc.nextInt();
		if (age1 >= 8 && 12 >= age1) {
			System.out.println("�ʵ��̳׿�!!");
		if(age1 >= 13 && 16 >= age1) {
			System.out.println("�ߵ��̳׿�."); 
			} 
		if(age1 >= 17 && 19 >= age1) {
			System.out.println("����̳׿�."); 
			}
		}
		
		System.out.println("�����Է�: ");
		int salary = sc.nextInt();
		if((salary * 12) >= 5000) {
			System.out.println("��׿����ڳ׿�!");
		}
		
	}
	
	//if~ else��
	public void ifElseTest() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�����Է�");
		int age = sc.nextInt();
		//���̰� 19�� �̻��̸� �����̴� ������ ��ƾ��Ҹ� ���
		//���̰� 19�� �̻��� �ƴϸ� �̼����̴� ���θ� ������ �ؾ���!�� ���
		if(age>19) {
			System.out.println("�����̴� ������ ��ƾ���");
		} else {
			System.out.println("�̼����̴� ���θ� ������ �ؾ���!");
		}
		System.out.print("����: ");
		int eng = sc.nextInt();
		System.out.print("����: ");
		int kor = sc.nextInt();
		System.out.print("����: ");
		int math = sc.nextInt();
		double avg = (eng + kor + math)/3.0;
		//����� 60�̻��̰�, �� ������ 40�̻��̸� �հ� �ƴϸ� ���հ�
		if(avg > 60 && eng >= 40 && kor >= 40 && math >= 40) {
			System.out.println("�հ�");
		}else {
			System.out.println("���հ�");
		}
		
		//if~else���� �Ѱ��� �׷�! else���� �ݵ�� if���� ���� ���. 
		
		
		//�ǽ����� 11p
		System.out.println("�л��̸�: ");
		String name = sc.nextLine();
		System.out.println("�г�: ");
		int grade = sc.nextInt();
		System.out.println("��");
		int class1 = sc.nextInt();
		System.out.println("��ȣ");
		int number = sc.nextInt();
		System.out.println("����: ");
		char gender = sc.next().charAt(0);
		System.out.println("����: ");
		double score = sc.nextDouble();
		if(gender == 'M') {
			System.out.println(grade + "�г�" + class1 + "��" + number + "��" + "���л�" + name + "��" + "������" + score + "�̴�.");
		}else {
			System.out.println(grade + "�г�" + class1 + "��" + number + "��" + "���л�" + name + "��" + "������" + score + "�̴�.");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}