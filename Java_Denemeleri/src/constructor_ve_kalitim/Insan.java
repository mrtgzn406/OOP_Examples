package constructor_ve_kalitim;

public class Insan {
	int boy, yas, kilo;
	
	public Insan(int uzunluk, int yas, int agirlik ) {
		this.boy = uzunluk;
		this.yas = yas;
		this.kilo = agirlik;
	}
	
	void yemek() {
		kilo++;
	}
	
	void spor() {
		kilo--;
	}
}
