package constructor_ve_kalitim;

public class Ortak {

	public static void main(String[] args) {

		
		Insan mudur = new Insan(184, 38, 74);
		
		System.out.println("Müdürün boyu: "+mudur.boy);
		System.out.println("Müdürün yaşı: "+mudur.yas);
		System.out.println("Müdürün kilosu: "+mudur.kilo);
		
		Muhendis musti = new Muhendis(179,34,85);
		
		System.out.println("Mustinin boyu: "+musti.boy);
		System.out.println("Mustinin yaşı: "+musti.yas);
		System.out.println("Mustinin kilosu: "+musti.kilo);
		
		
		
	}

}
