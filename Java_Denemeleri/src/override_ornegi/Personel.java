package override_ornegi;

public class Personel {
	String ad, soyad;
	int maas;
	String meslek;
	int yas;
	
	void maasHesapla() {
		System.out.println("Maaşınız yattı ve yeni bakiyeniz yüklendi");
		maas = 1000;
		meslek = "doktor";
		yas = 30;
		
	}

	public static void main(String[] args) {
		
		Personel Ali = new Personel();
		Ali.maasHesapla();
		System.out.println("Ali'nin maaşı: "+Ali.maas);
		System.out.println("Ali'nin mesleği: "+Ali.meslek);
		System.out.println("Ali'nin yaşı: "+Ali.yas);
		
		Mudur Mehmet = new Mudur();
		Mehmet.maasHesapla();
		System.out.println("Mehmet'in maaşı: "+Mehmet.maas);
		System.out.println("Mehmet'in mesleği: "+Mehmet.meslek);
		System.out.println("Mehmet'in yaşı: "+Mehmet.yas);
		
		Memur Ayse = new Memur();
		Ayse.maasHesapla();
		System.out.println("Ayşe'nin maaşı: "+Ayse.maas);
		System.out.println("Ayşe'nin mesleği: "+Ayse.meslek);
		System.out.println("Ayşe'nin yaşı: "+Ayse.yas);
	}

}
