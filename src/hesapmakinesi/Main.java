package hesapmakinesi;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int secim,faktoriyel,random;
		double sayi1,sayi2,sonuc;
		
		do {
			secim=MenuDegerAl();
			
			switch(secim) {
			
			case 1:
				sayi1=Ondal�kSay�Al();
				sayi2=Ondal�kSay�Al();
				sonuc=Toplama(sayi1,sayi2);
				SonucGoster(sonuc);
				break;
			case 2:
				sayi1=Ondal�kSay�Al();
				sayi2=Ondal�kSay�Al();
				sonuc=��kartma(sayi1,sayi2);
				SonucGoster(sonuc);
				break;
			case 3:
				sayi1=Ondal�kSay�Al();
				sayi2=Ondal�kSay�Al();
				sonuc=�arpma(sayi1,sayi2);
				SonucGoster(sonuc);
				break;
			case 4:
				sayi1=Ondal�kSay�Al();
				sayi2=Ondal�kSay�Al();
				sonuc=B�lme(sayi1,sayi2);
				SonucGoster(sonuc);
				break;
				
			case 5:
				faktoriyel=TamSay�Al();
				sonuc=Fakt�riyel(faktoriyel);
				SonucGoster(sonuc);
				break;
				
				
			case 6:
				random=TamSay�Al();
				sonuc=RandomSayiUret(random);
				SonucGoster(sonuc);
				break;
				default:
					System.out.println("Hesap makinesini kulland�g�n�z i�in te�ekk�rler..");
				break;
			}
			
			
			
		}
		while(secim!=7);
		System.out.println("��k�� yapt�n�z6");

	}
	public static void MenuGoster() {
		System.out.println("1-Toplama ");
		System.out.println("2-��kartma  ");
		System.out.println("3-�arpma  ");
		System.out.println("4-B�lme ");
		System.out.println("5-Fakt�riyel  ");
		System.out.println("6-Random  ");
		System.out.println("7-��k��  ");
	}

	public static int MenuDegerAl() {
		Scanner scan=new Scanner(System.in);
		int sayi;
		MenuGoster();
		sayi=scan.nextInt();
		
		while(sayi<1 || sayi>7) {
			
			
			System.out.println("\n\n\n\nL�tfen ge�erli bir de�er giriniz..");
			MenuGoster();
			sayi=scan.nextInt();	
			
		}
	return sayi;
	}
 
	public static double Ondal�kSay�Al() {
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen bir ondal�k deger giriniz.");
		int sayi=scan.nextInt();
		
		return sayi;
		
		
	}
	
	
	public static double Toplama(double num1,double num2) {
		
		return num1+num2;
	}

	public static double ��kartma(double num1,double num2) {
		
		return num1-num2;
		}
	public static double �arpma(double num1,double num2) {
	
	return num1*num2;
}
	public static double B�lme(double num1,double num2) {
	
	return num1/num2;
}
	public static int Fakt�riyel(int num) {
		
		int fakt=1;
		for(int i=1;i<=num;i++) {
			
			fakt=fakt*i;
		}
		return fakt;
		
	}
	public static int RandomSayiUret(int num) {
		int rsayi;
		Random randnum=new Random();
		 return  rsayi=randnum.nextInt(num)+1;
		
		
	}
	
	public static void SonucGoster(double num) {
		
		System.out.println("��LEM�N�Z�N SONUCU : "+num);
	}

	public static int TamSay�Al() {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen bir tam sayi giriniz..");
		int tamsayi=scan.nextInt();
		return tamsayi;
	}
	
	
	
	
	
	
	
}
