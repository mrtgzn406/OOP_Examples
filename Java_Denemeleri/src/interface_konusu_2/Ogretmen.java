package interface_konusu_2;

public class Ogretmen implements Arayuz{

	@Override
	public void yazdir(String brans, double maas) {
		System.out.println("Bu öğretmenin branşı "+brans+ ", maaşı ise "+maas + " TL'dir");		
	}
	
}
