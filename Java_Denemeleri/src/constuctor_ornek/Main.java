package constuctor_ornek;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Insan ali = new Insan(184, 27, 75);
		
		System.out.println("Alinin boyu   "+ali.boy  +  " cm'dir");
		System.out.println("Alinin kilosu "+ali.kilo +  " kilogramdır");
		System.out.println("Alinin yaşı   "+ali.yas  +  " olmuştur");
		
		//-----------------------------------------------------------------
		
		Insan veli = new Insan(174,32,87);
		
		System.out.println("Velinin boyu   "+veli.boy  +  " cm'dir");
		System.out.println("Velinin kilosu "+veli.kilo +  " kilogramdır");
		System.out.println("Velinin yaşı   "+veli.yas  +  " olmuştur");
		
	}

}
