package interface_konusu_3;

public class Giyim implements Arayuz{

	@Override
	public void ekle(int urunKodu) {
		// TODO Auto-generated method stub
		System.out.println(urunKodu+" koduna sahip ürün eklendi");
	}

	@Override
	public void sil(int urunKodu) {
		// TODO Auto-generated method stub
		System.out.println(urunKodu+" koduna sahip ürün silindi");
	}

	@Override
	public void guncelle(int urunKodu) {
		// TODO Auto-generated method stub
		System.out.println(urunKodu+" koduna sahip ürün güncellendi");
		
	}




	
}
