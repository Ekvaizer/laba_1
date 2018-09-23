package laba_1;

import java.util.Scanner;

public class Main {
	static Scanner scn = new Scanner (System.in);
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
 
		 
	System.out.println("1 - Возведения в степень 2^n  ");
	System.out.println("2 - Вычесления произвольного факториала ");
	System.out.println("3 - Находжения катета если известна гипотенуза и катет  ");
	System.out.println("4 - Даны два действительных числа. Необходимо получить их\r\n" + 
			"сумму, разность и произведение. Результат вывести на консоль ");
	System.out.println("5 - Определить время свободного падения материального тела с\r\n" + 
			"заданной высоты h. Результат вывести в консоль  ");
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
		System.out.println("Введите высоту с которой падает материальное тело");
		 double h = scn.nextDouble();
	        System.out.println("Время свободного падения материального тела = "+(Math.sqrt((2 * h) / 9.8))+"c");
	}

	private static void suma_raznost_proiz() {
		// TODO Auto-generated method stub
		
		System.out.println("Введите число а ");
		double a =scn.nextDouble();
		System.out.println("введите число b");
		double b = scn.nextDouble();
		double c = a*b;
		double v=a+b;
		double n = a-b;
		System.out.println("Сумма  : "+v);
		System.out.println("Разность : "+n);
		System.out.println("Произведения : "+c);
		
	}

	private static void vstepen() {
		// TODO Auto-generated method stub
		 Scanner scn = new Scanner(System.in);
		 System.out.println("Введите степень числа 2^n");
	 double k = scn.nextDouble();
		k = Math.pow(2,k);
		System.out.println(k);
		
		
	}

	private static void katet() {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Введите длину гипотенузы ");
		double c=scn.nextDouble();
		System.out.println("Введите длину катета ");
		double a=scn.nextDouble();
		 
		double otvet =Math.sqrt((c*c)-(a*a));
 
		System.out.println("Длина катета = "+otvet);
	 

	}

	private static void factorial() {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Введите факториал");
		int n =scn.nextInt();
		int k = 1;
		for(int i = 1;i<=n;i++) {
			k=k*i;
		}
		System.out.println("Факториал равен = "+k);
		
	}
 

	
	 
	}

 

 
