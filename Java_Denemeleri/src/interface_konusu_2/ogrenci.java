package interface_konusu_2;

public class ogrenci implements Arayuz{

	@Override
	public void yazdir(String isim, double not) {
		System.out.println("Bu öğrencinin ismi "+isim + ", notu ise "+ not);
		
	}

}
