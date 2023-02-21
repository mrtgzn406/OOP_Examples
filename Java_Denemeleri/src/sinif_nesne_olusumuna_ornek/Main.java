package sinif_nesne_olusumuna_ornek;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ev villa = new ev();	
		villa.renk = "mavi";
		
		System.out.println("villanın rengi: "+villa.renk);
		villa.badana();
		System.out.println("villanın yeni rengi: "+villa.renk);
		
		
	}

}
