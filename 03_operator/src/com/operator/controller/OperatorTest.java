package com.operator.controller;

import java.util.Scanner;

public class OperatorTest {
	
	public void basicOperator() {
		//단항연산자, 증감연산
		int su1 = 19;
		su1++; //su1 변수값을 1증가시키는 연산. 20
		++su1; //21
		System.out.println(su1);
		
		int su2 = 27;
		int su3;
		int su4;
		su3 = ++su2;//전위연산
		su2 = 27;
		su4 = su2++;//후위연산
		System.out.println(su3+" : "+su4);
		System.out.println(su2);
		
		su2 = 20;
		//su4 = su2+++30; //su2만 1증가됨
		su4 = ++su2+30;
		System.out.println(su4);
		System.out.println(su2);
		
				
		//부정연산
		//! 논리를 부정하는 것
		boolean flag = true;
		System.out.println(!flag);
		int age = 19;
		char gender='남';
		System.out.println(!(age>19&&gender=='남'));
		
		
		//산술연산
		//이항연산 값이 두개가 존재
		int su5 = 7;
		int su6 = 11;
		int result = su5+su6;
		System.out.println(result); //변수 이용
		
		result=10+20;
		System.out.println(result); //고정값 리터럴 이용
		
		result = su5-su6;
		System.out.println(result);
		
		result = su5*su6;
		System.out.println(result);
		
		result = su5/su6;
		System.out.println(result); //답이 실수라서 0이 나옴. 첨부터 result를 int값으로 받았기때문
		double result2 = (double)su5/su6; //하나만 더블로 바꿔줌
		System.out.println(result2);
	
		
		//%연산자
		// /는 몫을 수한다면 %는 나눈 나머지
		result = su5%su6;
		System.out.println(result);
		
		//짝수 구할때
		int su7=6;
		result = su7%2;
		System.out.println(result);
		su7=8;
		result = su7%2;
		System.out.println(result);
		
		//실습문제 연산자 8p
		Scanner sc = new Scanner(System.in);
		System.out.println("입력:");
		int su8 = sc.nextInt();			
		System.out.println("입력:");
		int su9 = sc.nextInt();	
		
		System.out.println("더하기결과" + (su8+su9));	 
		System.out.println("빼  기결과" + (su8-su9));		 
		System.out.println("나누기결과" + su8/su9);
		System.out.println("나머지결과" + su8%su9);
		System.out.println("곱하기결과" + su8*su9);

	}
	//실습문제 연산자 8p 답
	public void test1() {
		//계산기 만들기
		//정수 두개를 입력 받아 더하기빼기나누기나머지곱하기의 값을 구하는 프로그램
		int su = 0; //메소드 안에 변수를 선언했을 때 반드시 초기화(최초의 값을 넣어줌)해줘야함
		int su2 = 0; //메소드 안에 변수를 선언했을 때 반드시 초기화(최초의 값을 넣어줌)해줘야함
		//ㄴlocal variable 지역변수.
		//입력받아 = Scanner 1. Scanner import 2. Scanner 생성 3. sc.nextInt()/ sc.nextDouble()... 입력값받기
		Scanner sc = new Scanner(System.in);
		System.out.println("정수입력: ");
		su = sc.nextInt();
		System.out.println("정수입력: ");
		su2 = sc.nextInt();
		
		System.out.println("더하기결과 : " + su + "+" + su2 + "=" + (su+su2) + "입니다.");
		//System.out.println("나누기결과 : " + su + "/" + su2 + "=" + ((double)su/su2) + "입니다.");
		System.out.printf("나누기결과 : %d/%d=%.2f", su,su2,((double)su/su2) + "입니다.");
	}
	
	
	//비교연산자. 비교연산을 실행하면 반드시 true/false가 나옴
	//나중에 조건절 및 for문에서 많이 활용됨!
	//1. 동등비교하기 == : 같냐?! 같으면 true 다르면 false
	public void compareTest() {
		int su1 = 100;
		int su2 = 200;
		int su3 = 100;
		System.out.println(su1==su2);
		System.out.println(su1==su3);
		
		double dnum = 180.5;
		double dnum1 = 190.6;
		double dnum3 = 180.5;
		System.out.println(dnum==dnum1);
		System.out.println(dnum==dnum3);
		
		char ch = 'A';
		char ch1 = 'o';
		char ch2 = 'A';
		System.out.println(ch==ch1);
		System.out.println(ch==ch2); //(ch!=ch2) 같지않음
		
		//string 비교하기
		//string은 참조형 변수이기 때문에 변수에 주소값을 보관하여 == 으로 실제 값을 비교할 수 없음
		//그래서 실제 값을 비교하려면 equals()를 사용
		System.out.println("문자열 비교하기!!");
		
		String str = "유슬기";
		System.out.println(str=="유슬기");
		
		String str1 = new String("유슬기");
		System.out.println(str1=="유슬기");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("당신이름: ");
		String name = sc.nextLine();
		System.out.println(str==name);
		//스트링은 동등비교할때 equals()메소드를 이용함
		System.out.println(str.equals(name));
		System.out.println(name.equals("유슬기")); 
		System.out.println(!name.equals("유슬기")); //name이 유슬기가 아니니(not equal)라고 물을때 느낌표삽입. 진위형
		System.out.println("유슬기".equals("유슬기"));
		
		
		//대소비교하기
		System.out.println("정수입력: ");
		int su4=sc.nextInt();
		System.out.println("정수입력: ");
		int su5=sc.nextInt();
		System.out.println(su4<su5);
		System.out.println(su4>su5);
		
		//수의 범위를 나타낼때!
		//비교연산, 논리연산 같이 사용
		// 1<su4<100 컴퓨터가 인식할 수 없음(논리연산가서할것)
		
		// char형 자료형도 대소비교가 가능!!
		System.out.println("문자 대소비교하기!");
		char ch4 = 'A';
		char ch5 = 'a';
		System.out.println(ch4<ch5);
		System.out.println((int)ch4 + " " + (int)ch5);
		int num1 = 65;
		int num2 = 98;
		System.out.println((char)num1 + " " + (char)num2);
		System.out.println(ch4++);
		System.out.println(ch4++);
		System.out.println(ch4++);
		System.out.println(ch4++);
		System.out.println(ch4++);
		System.out.println(ch4++);
		System.out.println(ch4++);
		System.out.println(ch4++);
		
		//num값을 문자 한 개를 입력받고 대문자인지 확인
		System.out.println(ch4<'Z');
	}
	
	public void compareTest01() {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력: ");
		int su6=sc.nextInt();
		System.out.println("입력: ");
		int su7=sc.nextInt();
		System.out.println(su6<su7);
		System.out.println(su7>su6);
		System.out.println(su6>su7);
		System.out.println(su7<su6);
		
		System.out.println("정수입력: ");
		int a=sc.nextInt();
		System.out.println("정수입력: ");
		int b=sc.nextInt();
		System.out.println(a%2==0);
		System.out.println(b%3==0);
		
		//boolean flag = a%2==0; //불린형으로도 가능		
		}
	
	//논리연산하기
	public void logicTest() {
		//&&연산하기
		//논리연산은 이항연산으로 진위형 두개를 비교하여 진위형을 반환하는 것임.
		int su=10;
		System.out.println(su>1&&su<10); //1<su<10
		char ch ='B';
		System.out.println(su>1&&ch=='b');
		System.out.println(su>1&&ch=='B');
		
		//어린이용 놀이기구 탑승프로그램
		//1. 티켓여부 2. 키 제한 
		boolean ticket = true;
		double height = 180.5;
		System.out.println(ticket&&height>140);
		//공연장 출입관리
		//1. 공연티켓이 있거나 초대권이 있으면 통과 2. 둘 다 아니면 못 봐
		int pTicket = 123456; //일련번호라치고
		int chodae = 5555666;
		System.out.println(pTicket==123456||chodae==5555999); //티켓이 트루니까 초대권여부 상관없으므로 true가 나옴
		
		//로그인하는 로직 id/pw를 입력받고 id가 admin이고 비밀번호가 1234면 true 아니면 false;				
		Scanner sc = new Scanner(System.in);
		System.out.println("id: ");
		String id=sc.nextLine();
		System.out.println("pw: ");
		String pw=sc.nextLine();	
		System.out.println(id.equals("admin")&&pw.equals("1234"));

		//공연장 출입
		//티켓113이나 초대권443이 있고 나이가 19세 이상에 해당하면 true 아니면 false
		System.out.println("티켓,초대권번호: ");
		int num = sc.nextInt();
		System.out.println("나이: ");
		int age = sc.nextInt();
		System.out.println((num==113||num==443)&&age>=19); //우선순위가 &&이므로 ||에 괄호쳐줌
		
		sc.nextLine(); //nextInt다음 nextLine을받고있으니까 초기화해줘야함
		
		//회원가입시 필수입력
		//아이디 패스워드 
		//둘 중 하나만 입력 (이메일, 전화번호)
		System.out.println("아이디: ");
		id=sc.nextLine();
		System.out.println("비밀번호: ");
		pw=sc.nextLine();
		System.out.println("이메일: ");
		String email = sc.nextLine();
		System.out.println("전화번호: ");
		String phone = sc.nextLine();
		
		//아이디와 패스워드는 입력받고, 이메일 또는 전화번호가 입력
//		!id.equals("")&&!pw.equals("")&&(!email.equals("")||!phone.equals(""));
		
		//문자 하나를 입력 받고 그 문자가 알파벳 대문자이면 true 아니면 false;		 
		System.out.println("입력: ");
		char character = sc.next().charAt(0);		
		System.out.println('A'<=character&&character<='Z');
		//System.out.println('a'<=character&&character<='z');//소문자일 경우
		//System.out.println('a'<=character&&character<='z'||'A'<=character&&character<='Z');//대소문자 모두 포함할 경우
	}
	
	
	
	//비트연산확인하기
	public void bitTest() {
		int a = 10, b = 22;
		String basic = "00000000000000000000000000000000";
		String bit = basic + Integer.toBinaryString(a); //이진수값
		//a비트값 출력
		bit = bit.substring(bit.length()-32);
		System.out.println("a비트값: " + bit );
		//b비트값 출력
		bit = basic + Integer.toBinaryString(b);
		bit = bit.substring(bit.length()-32);
		System.out.println("b비트값: " + bit );
		//a&&b 연산결과 출력. 모두 값이 1일때만 1이 나옴.
		bit = basic + Integer.toBinaryString(a&b);
		bit = bit.substring(bit.length()-32);
		System.out.println("a&b비트: " + bit );
		//a|b 연산출력
		bit = basic + Integer.toBinaryString(a|b);
		bit = bit.substring(bit.length()-32);
		System.out.println("a|b비트: " + bit );
		//a^b 연산.  XOR ==> 암호화알고리즘에서 좀 사용
		bit = basic + Integer.toBinaryString(a^b);
		bit = bit.substring(bit.length()-32);
		System.out.println("a^b비트: " + bit );
		//~a연산 출력하기
		bit = basic + Integer.toBinaryString(~a);
		bit = bit.substring(bit.length()-32);
		System.out.println("~a비트 : " + bit );
		//a<<1 곱하기 연산 출력하기
		bit = basic + Integer.toBinaryString(a<<1);
		bit = bit.substring(bit.length()-32);
		System.out.println("a<<1값 : " + bit );
		//a>>1 나누기 연산 출력하기
		bit = basic + Integer.toBinaryString(a>>1);
		bit = bit.substring(bit.length()-32);
		System.out.println("a>>1값 : " + bit );
	}
	
	
	//복합대입연산자 활용하기
	public void inputComplex() {
		//복합대입연산자를 원하는 수를 지정한 변수에 산술(+,-,*,/,%)연산하여 다시 대입하는 것
		int account = 1000000000;
		//account에서 인출
		//100000
		account -= 100000; // account = account -100000;
		System.out.println(account);
		account += 1000000000;
		System.out.println(account);
		
		//입력한 값들의 합계 구하기
		Scanner sc = new Scanner(System.in);
		int sum = 0; //지역변수 초기화
		System.out.println("정수입력: ");
		sum += sc.nextInt(); //누적시킴
		//int su1 = sc.nextInt();
		System.out.println("정수입력: ");
		sum += sc.nextInt();
		//int su2 = sc.nextInt();
		System.out.println("정수입력: ");
		sum += sc.nextInt();
		//int su3 = sc.nextInt();
		//int sum = su1 + su2 + su3;
		System.out.println(sum);
		
		//국어, 영어, 수학, 코딩 성적을 입력하여 합계와 평균을 구하는 프로그램
		//단 국어, 영어, 수학, 코딩 성적을 따로 보관할 필요는 없다.					
		int sum1 = 0; //sum=0; sum을 쓰고 싶으면 sum을 초기화		
		System.out.println("국어점수: ");
		sum1 += sc.nextInt();
		System.out.println("영어점수: ");
		sum1 += sc.nextInt();
		System.out.println("수학점수: ");
		sum1 += sc.nextInt();
		System.out.println("코딩점수: ");
		sum1 += sc.nextInt();
		//합계
		System.out.println("합계: " + sum1);
		//평균
		System.out.println("평균: " + sum1/4.0); //실수 자동형변환	
	}
	
	
	//삼항 연산자 활용하기
	public void thirdOper() {
		//삼항연산자는 조건식 ? true : false
		System.out.println("유병승".equals("김인술") ? "같다" : "다르다");
		
		/////////////////
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름입력: ");
		System.out.println(sc.nextLine().equals("김인술") ? "같다" : "다르다");
		
		
		//티켓(999)이 있고 나이가 19 초과면 입장!, 아니면 입장불가! 출력
		System.out.println("티켓: ");
		int ticket = sc.nextInt();
		System.out.println("나이: ");
		int age = sc.nextInt();
		//System.out.println((ticket==999&&age>19) ? "입장!" : "입장불가!");
		String msg = ticket==999&&age>19 ? "입장!" : "입장불가!";
		//msg="입장";
		System.out.println(msg);
		
		
		System.out.print("정수입력: ");
		int inputSu=sc.nextInt();
		int result = inputSu>10 ? inputSu*20  : inputSu/20;
		System.out.println(result);				
		//삼항연산자 안에 삼항연산자
		System.out.print(inputSu>19 ? "성년입니다." : inputSu>=14&&inputSu<=16 ? "중학생" : inputSu<14 ? "초딩" : "고등학생");
	}
	
	//실습예제 pdf-20p
	public void eg01() {
		Scanner sc = new Scanner(System.in);
		System.out.print("나이: ");
		int age = sc.nextInt();
		System.out.println(age>19 ? "성인입니다. 들어오세요." : "미성년자입니다. 들어올 수 없습니다.");
		 
		System.out.print("성별: ");
		String gender = sc.nextLine();
		System.out.println(gender.equals("남자") ? "왼쪽으로 가세요." : "오른쪽으로 가세요.");	
	}
	

	
	
	
	
	//실습예제 pdf-21p
	public void eg02() {
		Scanner sc = new Scanner(System.in);		
		System.out.println("a의 연봉: ");
		int a = sc.nextInt();
		System.out.println("b의 연봉: ");		
		int b = sc.nextInt();
		System.out.println("c의 연봉: ");
		int c = sc.nextInt();
		System.out.println("합계: " + (a+b+c));
		System.out.println("평균: " + (a+b+c)/3);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
