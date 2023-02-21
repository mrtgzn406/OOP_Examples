package interface_konusu_3;

public interface Arayuz {
	void ekle(int urunKodu);
	void sil(int urunKodu);
	void guncelle(int urunKodu);
	
	// javada eğer bir interface'nin içinde birden fazla metot varsa, class'lara o interface "implements" koduyla uygulandığında
	// interface içinde yer alan bütün metotlar kullanılmak zorundadır, yani override edilmek(ezilmek) zorundadır
	
	
}
