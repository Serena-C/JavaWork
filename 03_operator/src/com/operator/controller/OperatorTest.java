package com.operator.controller;

import java.util.Scanner;

public class OperatorTest {
	
	public void basicOperator() {
		//���׿�����, ��������
		int su1 = 19;
		su1++; //su1 �������� 1������Ű�� ����. 20
		++su1; //21
		System.out.println(su1);
		
		int su2 = 27;
		int su3;
		int su4;
		su3 = ++su2;//��������
		su2 = 27;
		su4 = su2++;//��������
		System.out.println(su3+" : "+su4);
		System.out.println(su2);
		
		su2 = 20;
		//su4 = su2+++30; //su2�� 1������
		su4 = ++su2+30;
		System.out.println(su4);
		System.out.println(su2);
		
				
		//��������
		//! ���� �����ϴ� ��
		boolean flag = true;
		System.out.println(!flag);
		int age = 19;
		char gender='��';
		System.out.println(!(age>19&&gender=='��'));
		
		
		//�������
		//���׿��� ���� �ΰ��� ����
		int su5 = 7;
		int su6 = 11;
		int result = su5+su6;
		System.out.println(result); //���� �̿�
		
		result=10+20;
		System.out.println(result); //������ ���ͷ� �̿�
		
		result = su5-su6;
		System.out.println(result);
		
		result = su5*su6;
		System.out.println(result);
		
		result = su5/su6;
		System.out.println(result); //���� �Ǽ��� 0�� ����. ÷���� result�� int������ �޾ұ⶧��
		double result2 = (double)su5/su6; //�ϳ��� ����� �ٲ���
		System.out.println(result2);
	
		
		//%������
		// /�� ���� ���Ѵٸ� %�� ���� ������
		result = su5%su6;
		System.out.println(result);
		
		//¦�� ���Ҷ�
		int su7=6;
		result = su7%2;
		System.out.println(result);
		su7=8;
		result = su7%2;
		System.out.println(result);
		
		//�ǽ����� ������ 8p
		Scanner sc = new Scanner(System.in);
		System.out.println("�Է�:");
		int su8 = sc.nextInt();			
		System.out.println("�Է�:");
		int su9 = sc.nextInt();	
		
		System.out.println("���ϱ���" + (su8+su9));	 
		System.out.println("��  ����" + (su8-su9));		 
		System.out.println("��������" + su8/su9);
		System.out.println("���������" + su8%su9);
		System.out.println("���ϱ���" + su8*su9);

	}
	//�ǽ����� ������ 8p ��
	public void test1() {
		//���� �����
		//���� �ΰ��� �Է� �޾� ���ϱ⻩�⳪���⳪�������ϱ��� ���� ���ϴ� ���α׷�
		int su = 0; //�޼ҵ� �ȿ� ������ �������� �� �ݵ�� �ʱ�ȭ(������ ���� �־���)�������
		int su2 = 0; //�޼ҵ� �ȿ� ������ �������� �� �ݵ�� �ʱ�ȭ(������ ���� �־���)�������
		//��local variable ��������.
		//�Է¹޾� = Scanner 1. Scanner import 2. Scanner ���� 3. sc.nextInt()/ sc.nextDouble()... �Է°��ޱ�
		Scanner sc = new Scanner(System.in);
		System.out.println("�����Է�: ");
		su = sc.nextInt();
		System.out.println("�����Է�: ");
		su2 = sc.nextInt();
		
		System.out.println("���ϱ��� : " + su + "+" + su2 + "=" + (su+su2) + "�Դϴ�.");
		//System.out.println("�������� : " + su + "/" + su2 + "=" + ((double)su/su2) + "�Դϴ�.");
		System.out.printf("�������� : %d/%d=%.2f", su,su2,((double)su/su2) + "�Դϴ�.");
	}
	
	
	//�񱳿�����. �񱳿����� �����ϸ� �ݵ�� true/false�� ����
	//���߿� ������ �� for������ ���� Ȱ���!
	//1. ������ϱ� == : ����?! ������ true �ٸ��� false
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
		System.out.println(ch==ch2); //(ch!=ch2) ��������
		
		//string ���ϱ�
		//string�� ������ �����̱� ������ ������ �ּҰ��� �����Ͽ� == ���� ���� ���� ���� �� ����
		//�׷��� ���� ���� ���Ϸ��� equals()�� ���
		System.out.println("���ڿ� ���ϱ�!!");
		
		String str = "������";
		System.out.println(str=="������");
		
		String str1 = new String("������");
		System.out.println(str1=="������");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("����̸�: ");
		String name = sc.nextLine();
		System.out.println(str==name);
		//��Ʈ���� ������Ҷ� equals()�޼ҵ带 �̿���
		System.out.println(str.equals(name));
		System.out.println(name.equals("������")); 
		System.out.println(!name.equals("������")); //name�� �����Ⱑ �ƴϴ�(not equal)��� ������ ����ǥ����. ������
		System.out.println("������".equals("������"));
		
		
		//��Һ��ϱ�
		System.out.println("�����Է�: ");
		int su4=sc.nextInt();
		System.out.println("�����Է�: ");
		int su5=sc.nextInt();
		System.out.println(su4<su5);
		System.out.println(su4>su5);
		
		//���� ������ ��Ÿ����!
		//�񱳿���, ������ ���� ���
		// 1<su4<100 ��ǻ�Ͱ� �ν��� �� ����(�����갡���Ұ�)
		
		// char�� �ڷ����� ��Һ񱳰� ����!!
		System.out.println("���� ��Һ��ϱ�!");
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
		
		//num���� ���� �� ���� �Է¹ް� �빮������ Ȯ��
		System.out.println(ch4<'Z');
	}
	
	public void compareTest01() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�Է�: ");
		int su6=sc.nextInt();
		System.out.println("�Է�: ");
		int su7=sc.nextInt();
		System.out.println(su6<su7);
		System.out.println(su7>su6);
		System.out.println(su6>su7);
		System.out.println(su7<su6);
		
		System.out.println("�����Է�: ");
		int a=sc.nextInt();
		System.out.println("�����Է�: ");
		int b=sc.nextInt();
		System.out.println(a%2==0);
		System.out.println(b%3==0);
		
		//boolean flag = a%2==0; //�Ҹ������ε� ����		
		}
	
	//�������ϱ�
	public void logicTest() {
		//&&�����ϱ�
		//�������� ���׿������� ������ �ΰ��� ���Ͽ� �������� ��ȯ�ϴ� ����.
		int su=10;
		System.out.println(su>1&&su<10); //1<su<10
		char ch ='B';
		System.out.println(su>1&&ch=='b');
		System.out.println(su>1&&ch=='B');
		
		//��̿� ���̱ⱸ ž�����α׷�
		//1. Ƽ�Ͽ��� 2. Ű ���� 
		boolean ticket = true;
		double height = 180.5;
		System.out.println(ticket&&height>140);
		//������ ���԰���
		//1. ����Ƽ���� �ְų� �ʴ���� ������ ��� 2. �� �� �ƴϸ� �� ��
		int pTicket = 123456; //�Ϸù�ȣ��ġ��
		int chodae = 5555666;
		System.out.println(pTicket==123456||chodae==5555999); //Ƽ���� Ʈ��ϱ� �ʴ�ǿ��� ��������Ƿ� true�� ����
		
		//�α����ϴ� ���� id/pw�� �Է¹ް� id�� admin�̰� ��й�ȣ�� 1234�� true �ƴϸ� false;				
		Scanner sc = new Scanner(System.in);
		System.out.println("id: ");
		String id=sc.nextLine();
		System.out.println("pw: ");
		String pw=sc.nextLine();	
		System.out.println(id.equals("admin")&&pw.equals("1234"));

		//������ ����
		//Ƽ��113�̳� �ʴ��443�� �ְ� ���̰� 19�� �̻� �ش��ϸ� true �ƴϸ� false
		System.out.println("Ƽ��,�ʴ�ǹ�ȣ: ");
		int num = sc.nextInt();
		System.out.println("����: ");
		int age = sc.nextInt();
		System.out.println((num==113||num==443)&&age>=19); //�켱������ &&�̹Ƿ� ||�� ��ȣ����
		
		sc.nextLine(); //nextInt���� nextLine���ް������ϱ� �ʱ�ȭ�������
		
		//ȸ�����Խ� �ʼ��Է�
		//���̵� �н����� 
		//�� �� �ϳ��� �Է� (�̸���, ��ȭ��ȣ)
		System.out.println("���̵�: ");
		id=sc.nextLine();
		System.out.println("��й�ȣ: ");
		pw=sc.nextLine();
		System.out.println("�̸���: ");
		String email = sc.nextLine();
		System.out.println("��ȭ��ȣ: ");
		String phone = sc.nextLine();
		
		//���̵�� �н������ �Է¹ް�, �̸��� �Ǵ� ��ȭ��ȣ�� �Է�
//		!id.equals("")&&!pw.equals("")&&(!email.equals("")||!phone.equals(""));
		
		//���� �ϳ��� �Է� �ް� �� ���ڰ� ���ĺ� �빮���̸� true �ƴϸ� false;		 
		System.out.println("�Է�: ");
		char character = sc.next().charAt(0);		
		System.out.println('A'<=character&&character<='Z');
		//System.out.println('a'<=character&&character<='z');//�ҹ����� ���
		//System.out.println('a'<=character&&character<='z'||'A'<=character&&character<='Z');//��ҹ��� ��� ������ ���
	}
	
	
	
	//��Ʈ����Ȯ���ϱ�
	public void bitTest() {
		int a = 10, b = 22;
		String basic = "00000000000000000000000000000000";
		String bit = basic + Integer.toBinaryString(a); //��������
		//a��Ʈ�� ���
		bit = bit.substring(bit.length()-32);
		System.out.println("a��Ʈ��: " + bit );
		//b��Ʈ�� ���
		bit = basic + Integer.toBinaryString(b);
		bit = bit.substring(bit.length()-32);
		System.out.println("b��Ʈ��: " + bit );
		//a&&b ������ ���. ��� ���� 1�϶��� 1�� ����.
		bit = basic + Integer.toBinaryString(a&b);
		bit = bit.substring(bit.length()-32);
		System.out.println("a&b��Ʈ: " + bit );
		//a|b �������
		bit = basic + Integer.toBinaryString(a|b);
		bit = bit.substring(bit.length()-32);
		System.out.println("a|b��Ʈ: " + bit );
		//a^b ����.  XOR ==> ��ȣȭ�˰��򿡼� �� ���
		bit = basic + Integer.toBinaryString(a^b);
		bit = bit.substring(bit.length()-32);
		System.out.println("a^b��Ʈ: " + bit );
		//~a���� ����ϱ�
		bit = basic + Integer.toBinaryString(~a);
		bit = bit.substring(bit.length()-32);
		System.out.println("~a��Ʈ : " + bit );
		//a<<1 ���ϱ� ���� ����ϱ�
		bit = basic + Integer.toBinaryString(a<<1);
		bit = bit.substring(bit.length()-32);
		System.out.println("a<<1�� : " + bit );
		//a>>1 ������ ���� ����ϱ�
		bit = basic + Integer.toBinaryString(a>>1);
		bit = bit.substring(bit.length()-32);
		System.out.println("a>>1�� : " + bit );
	}
	
	
	//���մ��Կ����� Ȱ���ϱ�
	public void inputComplex() {
		//���մ��Կ����ڸ� ���ϴ� ���� ������ ������ ���(+,-,*,/,%)�����Ͽ� �ٽ� �����ϴ� ��
		int account = 1000000000;
		//account���� ����
		//100000
		account -= 100000; // account = account -100000;
		System.out.println(account);
		account += 1000000000;
		System.out.println(account);
		
		//�Է��� ������ �հ� ���ϱ�
		Scanner sc = new Scanner(System.in);
		int sum = 0; //�������� �ʱ�ȭ
		System.out.println("�����Է�: ");
		sum += sc.nextInt(); //������Ŵ
		//int su1 = sc.nextInt();
		System.out.println("�����Է�: ");
		sum += sc.nextInt();
		//int su2 = sc.nextInt();
		System.out.println("�����Է�: ");
		sum += sc.nextInt();
		//int su3 = sc.nextInt();
		//int sum = su1 + su2 + su3;
		System.out.println(sum);
		
		//����, ����, ����, �ڵ� ������ �Է��Ͽ� �հ�� ����� ���ϴ� ���α׷�
		//�� ����, ����, ����, �ڵ� ������ ���� ������ �ʿ�� ����.					
		int sum1 = 0; //sum=0; sum�� ���� ������ sum�� �ʱ�ȭ		
		System.out.println("��������: ");
		sum1 += sc.nextInt();
		System.out.println("��������: ");
		sum1 += sc.nextInt();
		System.out.println("��������: ");
		sum1 += sc.nextInt();
		System.out.println("�ڵ�����: ");
		sum1 += sc.nextInt();
		//�հ�
		System.out.println("�հ�: " + sum1);
		//���
		System.out.println("���: " + sum1/4.0); //�Ǽ� �ڵ�����ȯ	
	}
	
	
	//���� ������ Ȱ���ϱ�
	public void thirdOper() {
		//���׿����ڴ� ���ǽ� ? true : false
		System.out.println("������".equals("���μ�") ? "����" : "�ٸ���");
		
		/////////////////
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸��Է�: ");
		System.out.println(sc.nextLine().equals("���μ�") ? "����" : "�ٸ���");
		
		
		//Ƽ��(999)�� �ְ� ���̰� 19 �ʰ��� ����!, �ƴϸ� ����Ұ�! ���
		System.out.println("Ƽ��: ");
		int ticket = sc.nextInt();
		System.out.println("����: ");
		int age = sc.nextInt();
		//System.out.println((ticket==999&&age>19) ? "����!" : "����Ұ�!");
		String msg = ticket==999&&age>19 ? "����!" : "����Ұ�!";
		//msg="����";
		System.out.println(msg);
		
		
		System.out.print("�����Է�: ");
		int inputSu=sc.nextInt();
		int result = inputSu>10 ? inputSu*20  : inputSu/20;
		System.out.println(result);				
		//���׿����� �ȿ� ���׿�����
		System.out.print(inputSu>19 ? "�����Դϴ�." : inputSu>=14&&inputSu<=16 ? "���л�" : inputSu<14 ? "�ʵ�" : "����л�");
	}
	
	//�ǽ����� pdf-20p
	public void eg01() {
		Scanner sc = new Scanner(System.in);
		System.out.print("����: ");
		int age = sc.nextInt();
		System.out.println(age>19 ? "�����Դϴ�. ��������." : "�̼������Դϴ�. ���� �� �����ϴ�.");
		 
		System.out.print("����: ");
		String gender = sc.nextLine();
		System.out.println(gender.equals("����") ? "�������� ������." : "���������� ������.");	
	}
	

	
	
	
	
	//�ǽ����� pdf-21p
	public void eg02() {
		Scanner sc = new Scanner(System.in);		
		System.out.println("a�� ����: ");
		int a = sc.nextInt();
		System.out.println("b�� ����: ");		
		int b = sc.nextInt();
		System.out.println("c�� ����: ");
		int c = sc.nextInt();
		System.out.println("�հ�: " + (a+b+c));
		System.out.println("���: " + (a+b+c)/3);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
