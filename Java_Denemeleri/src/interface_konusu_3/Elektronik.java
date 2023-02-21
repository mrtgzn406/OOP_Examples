package interface_konusu_3;

public class Elektronik implements Arayuz{

	@Override
	public void ekle(int urunNo) {
		// TODO Auto-generated method stub
		System.out.println(urunNo+" ürün numarasına sahip ürün eklendi");
	}

	@Override
	public void sil(int urunNo) {
		// TODO Auto-generated method stub
		System.out.println(urunNo+" ürün numarasına sahip ürün silindi");
	}

	@Override
	public void guncelle(int urunNo) {
		// TODO Auto-generated method stub
		System.out.println(urunNo+" ürün numarasına sahip ürün güncellendi");
	}
	

}
