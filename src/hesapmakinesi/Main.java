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
				sayi1=OndalýkSayýAl();
				sayi2=OndalýkSayýAl();
				sonuc=Toplama(sayi1,sayi2);
				SonucGoster(sonuc);
				break;
			case 2:
				sayi1=OndalýkSayýAl();
				sayi2=OndalýkSayýAl();
				sonuc=Çýkartma(sayi1,sayi2);
				SonucGoster(sonuc);
				break;
			case 3:
				sayi1=OndalýkSayýAl();
				sayi2=OndalýkSayýAl();
				sonuc=Çarpma(sayi1,sayi2);
				SonucGoster(sonuc);
				break;
			case 4:
				sayi1=OndalýkSayýAl();
				sayi2=OndalýkSayýAl();
				sonuc=Bölme(sayi1,sayi2);
				SonucGoster(sonuc);
				break;
				
			case 5:
				faktoriyel=TamSayýAl();
				sonuc=Faktöriyel(faktoriyel);
				SonucGoster(sonuc);
				break;
				
				
			case 6:
				random=TamSayýAl();
				sonuc=RandomSayiUret(random);
				SonucGoster(sonuc);
				break;
				default:
					System.out.println("Hesap makinesini kullandýgýnýz için teþekkürler..");
				break;
			}
			
			
			
		}
		while(secim!=7);
		System.out.println("Çýkýþ yaptýnýz6");

	}
	public static void MenuGoster() {
		System.out.println("1-Toplama ");
		System.out.println("2-Çýkartma  ");
		System.out.println("3-Çarpma  ");
		System.out.println("4-Bölme ");
		System.out.println("5-Faktöriyel  ");
		System.out.println("6-Random  ");
		System.out.println("7-Çýkýþ  ");
	}

	public static int MenuDegerAl() {
		Scanner scan=new Scanner(System.in);
		int sayi;
		MenuGoster();
		sayi=scan.nextInt();
		
		while(sayi<1 || sayi>7) {
			
			
			System.out.println("\n\n\n\nLütfen geçerli bir deðer giriniz..");
			MenuGoster();
			sayi=scan.nextInt();	
			
		}
	return sayi;
	}
 
	public static double OndalýkSayýAl() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen bir ondalýk deger giriniz.");
		int sayi=scan.nextInt();
		
		return sayi;
		
		
	}
	
	
	public static double Toplama(double num1,double num2) {
		
		return num1+num2;
	}

	public static double Çýkartma(double num1,double num2) {
		
		return num1-num2;
		}
	public static double Çarpma(double num1,double num2) {
	
	return num1*num2;
}
	public static double Bölme(double num1,double num2) {
	
	return num1/num2;
}
	public static int Faktöriyel(int num) {
		
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
		
		System.out.println("ÝÞLEMÝNÝZÝN SONUCU : "+num);
	}

	public static int TamSayýAl() {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen bir tam sayi giriniz..");
		int tamsayi=scan.nextInt();
		return tamsayi;
	}
	
	
	
	
	
	
	
}
