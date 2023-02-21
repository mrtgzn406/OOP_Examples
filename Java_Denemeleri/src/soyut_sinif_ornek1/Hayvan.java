package soyut_sinif_ornek1;

public abstract class Hayvan {

	String cinsi;
	String isim;
	int kilo;
	
	abstract void sesCikar();
	
	void yemek() {
		kilo = kilo + 5;
	}
	
	public static void main(String[] args) {
		
		Kedi cat = new Kedi();
		cat.sesCikar();
		cat.kilo = 5;
		System.out.println("Kedinin kilosu: "+cat.kilo);
		cat.yemek();
		System.out.println("Kedinin yeni kilosu: "+cat.kilo);
		
		Kopek dog = new Kopek();
		dog.sesCikar();
		dog.kilo = 30;
		System.out.println("Köpeğin kilosu: "+dog.kilo);
		dog.yemek();
		System.out.println("Köpeğin yeni kilosu: "+dog.kilo);
	}

}
