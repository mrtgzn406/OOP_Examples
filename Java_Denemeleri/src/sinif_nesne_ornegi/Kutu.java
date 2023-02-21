package sinif_nesne_ornegi;

public class Kutu {
	int genislik = 10;
	int yukseklik = 20;
	int derinlik = 15;
	int hacim = 0;
	
	int hacimhesapla() {
		
		hacim = genislik * yukseklik * derinlik;
		return hacim;
	}
}
