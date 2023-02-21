package ad_soyad;

public class ortak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		kitap cinAli = new kitap();
		cinAli.fiyat = 50;
		cinAli.yazarAdi = "Rasim Kaygusuz";
		
		System.out.println("cinAli'nin fiyatı : "+cinAli.fiyat);
		cinAli.satis();
		System.out.println("cinAli'nin yeni fiyatı : "+cinAli.fiyat);
		
		
		
		telefon iphone = new telefon();
		iphone.model =" en son model";
		iphone.fiyat = 5000;
		
		System.out.println("iphone'un fiyatı: "+iphone.fiyat);
		iphone.satis();
		System.out.println("iphone'un yeni fiyatı: "+iphone.fiyat);
		
	}

}
