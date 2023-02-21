package scanner_kullan;

import java.util.Scanner;

public class Scanner_Kullanimi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner veri_al = new Scanner(System.in);
		
		float sayi1, sayi2;
		float ortalama;
		String islem;
		
		System.out.println("1. sayıyı giriniz: ");
		 sayi1 = veri_al.nextFloat();
		 
		System.out.println("2. sayıyı giriniz: ");
		sayi2 = veri_al.nextFloat();
		
		if(sayi1 + sayi2 < 250 ) {
		 ortalama = sayi1 * sayi2;
		 islem = "çarpma";
		}
		else if(sayi1 + sayi2 < 500){
			ortalama = sayi1 + sayi2;
			islem = "toplama";
		}
		else if(sayi1 + sayi2 < 750) {
			ortalama = sayi1 / sayi2;
			islem = "bölme";
		}
		else {
			ortalama = sayi1 - sayi2;
			islem = "çıkarma";
		}
		
		System.out.println("iki sayıya "+ islem +" uygulanmış ve sonuç "+ ortalama + " çıkmıştır" );
	}

}
