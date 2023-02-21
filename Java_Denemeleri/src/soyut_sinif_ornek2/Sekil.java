package soyut_sinif_ornek2;

public abstract class Sekil {
	
	int alan;
	abstract void alanHesapla();
	
	public static void main(String[] args) {
		
		Daire nesne1 = new Daire();
		
		nesne1.yaricap = 5;
		nesne1.alanHesapla();
		System.out.println("Dairenin alanı :"+nesne1.alan);
		
		
		Kare nesne2 = new Kare();
		
		nesne2.kenar = 9;
		nesne2.alanHesapla();
		System.out.println("Karenin alanı: "+nesne2.alan);
	}

}
