package laba_1;

import java.util.Scanner;

public class Main {
	static Scanner scn = new Scanner (System.in);
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
 
		 
	System.out.println("1 - ���������� � ������� 2^n  ");
	System.out.println("2 - ���������� ������������� ���������� ");
	System.out.println("3 - ���������� ������ ���� �������� ���������� � �����  ");
	System.out.println("4 - ���� ��� �������������� �����. ���������� �������� ��\r\n" + 
			"�����, �������� � ������������. ��������� ������� �� ������� ");
	System.out.println("5 - ���������� ����� ���������� ������� ������������� ���� �\r\n" + 
			"�������� ������ h. ��������� ������� � �������  ");
	int a=scn.nextInt();
 

	switch(a){
	
	case 1: vstepen() ;
    break;
		case 2: factorial();
    break;
		case 3: katet();
	break;
		case 4:suma_raznost_proiz();
    break;
		case 5:verazheniy();
	break;
	}
	 
   
	}
	private static void verazheniy() {
		System.out.println("������� ������ � ������� ������ ������������ ����");
		 double h = scn.nextDouble();
	        System.out.println("����� ���������� ������� ������������� ���� = "+(Math.sqrt((2 * h) / 9.8))+" ���");
	}

	private static void suma_raznost_proiz() {
		// TODO Auto-generated method stub
		
		System.out.println("������� ����� � ");
		double a =scn.nextDouble();
		System.out.println("������� ����� b");
		double b = scn.nextDouble();
		double c = a*b;
		double v=a+b;
		double n = a-b;
		System.out.println("�����  : "+v);
		System.out.println("�������� : "+n);
		System.out.println("������������ : "+c);
		
	}

	private static void vstepen() {
		// TODO Auto-generated method stub
		 Scanner scn = new Scanner(System.in);
		 System.out.println("������� ������� ����� 2^n");
	 double k = scn.nextDouble();
		k = Math.pow(2,k);
		System.out.println(k);
		
		
	}

	private static void katet() {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("������� ����� ���������� ");
		double c=scn.nextDouble();
		System.out.println("������� ����� ������ ");
		double a=scn.nextDouble();
		 
		double otvet =Math.sqrt((c*c)-(a*a));
 
		System.out.println("����� ������ = "+otvet);
	 

	}

	private static void factorial() {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("������� ���������");
		int n =scn.nextInt();
		int k = 1;
		for(int i = 1;i<=n;i++) {
			k=k*i;
		}
		System.out.println("��������� ����� = "+k);
		
	}
 

	
	 
	}

 
