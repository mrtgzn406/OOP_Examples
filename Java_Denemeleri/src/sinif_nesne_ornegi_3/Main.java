package sinif_nesne_ornegi_3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kitap mybook = new Kitap ();
	    mybook.kitapAdi= "Java ile Programlama";
	    mybook.yayinEvi= "Pegem";
	    mybook.sayfaSayisi=500;
	    mybook.maliyet=25;
	    mybook.satisFiyati();
	    System.out.println("Kitabin fiyati :" +mybook.fiyat);
	}

}
