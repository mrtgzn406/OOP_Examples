package sinif_nesne_ornegi_2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bisiklet B1 = new Bisiklet();
		
		B1.hiz = 25;
		System.out.println("Bisikletin hızı: "+B1.hiz);
		B1.vitesDegistir();
		System.out.println("Bisikletin yeni hızı: "+B1.hiz);
		
		
	}

}
