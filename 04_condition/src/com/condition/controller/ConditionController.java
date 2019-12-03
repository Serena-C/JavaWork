package com.condition.controller;

import java.util.Scanner;

public class ConditionController {
	
	Scanner sc = new Scanner(System.in);

	public void basicIf() {

		int a = 10;
		if(a > 5) {
			System.out.println("true면 출력");
		}

		System.out.println("티켓번호: ");
		int ticket = sc.nextInt();
		if (ticket == 777) {
			System.out.println("인증되었습니다.");
			System.out.println("입장하세요.");
		}

		System.out.println("당신의 나이");
		int age = sc.nextInt();
		if (age <= 19) {
			int inter = age - 20;
			System.out.println("미성년입니다. 들어오지마세요! " + inter + "년 후에 오세요.");
		}
		
		System.out.println("동물 혹은 식물을 입력하세요.");
		String str = sc.next();
		if(str.equals("동물")) {
			System.out.println("동물이면 출력"); 
		}
		
		System.out.println("나이: ");
		int age1 = sc.nextInt();
		if (age1 >= 8 && 12 >= age1) {
			System.out.println("초딩이네요!!");
		if(age1 >= 13 && 16 >= age1) {
			System.out.println("중딩이네요."); 
			} 
		if(age1 >= 17 && 19 >= age1) {
			System.out.println("고딩이네요."); 
			}
		}
		
		System.out.println("월급입력: ");
		int salary = sc.nextInt();
		if((salary * 12) >= 5000) {
			System.out.println("고액연봉자네요!");
		}
		
	}
	
	//if~ else문
	public void ifElseTest() {
		Scanner sc = new Scanner(System.in);
		System.out.print("나이입력");
		int age = sc.nextInt();
		//나이가 19살 이상이면 성인이니 열심히 살아야죠를 출력
		//나이가 19살 이상이 아니면 미성년이니 공부를 열심히 해야죠!를 출력
		if(age>19) {
			System.out.println("성인이니 열심히 살아야죠");
		} else {
			System.out.println("미성년이니 공부를 열심히 해야죠!");
		}
		System.out.print("영어: ");
		int eng = sc.nextInt();
		System.out.print("국어: ");
		int kor = sc.nextInt();
		System.out.print("수학: ");
		int math = sc.nextInt();
		double avg = (eng + kor + math)/3.0;
		//평균이 60이상이고, 각 과목이 40이상이면 합격 아니면 불합격
		if(avg > 60 && eng >= 40 && kor >= 40 && math >= 40) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		
		//if~else문은 한개의 그룹! else문은 반드시 if문과 같이 사용. 
		
		
		//실습문제 11p
		System.out.println("학생이름: ");
		String name = sc.nextLine();
		System.out.println("학년: ");
		int grade = sc.nextInt();
		System.out.println("반");
		int class1 = sc.nextInt();
		System.out.println("번호");
		int number = sc.nextInt();
		System.out.println("성별: ");
		char gender = sc.next().charAt(0);
		System.out.println("성적: ");
		double score = sc.nextDouble();
		if(gender == 'M') {
			System.out.println(grade + "학년" + class1 + "반" + number + "번" + "남학생" + name + "은" + "성적이" + score + "이다.");
		}else {
			System.out.println(grade + "학년" + class1 + "반" + number + "번" + "여학생" + name + "은" + "성적이" + score + "이다.");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}