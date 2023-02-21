package interface_konusu;

public class main {

	public static void main(String[] args) {
		
		// interface'lerden nesne oluşturamayız, hata verir.
		
		// IDatabase  arayüz = new IDatabase();
		

		
		
		// Fakat eğer IDatabase isimli interface'i eğer oluşturduğumuz class'lara implements koduyla  uygularsak, 
		// oluşturduğumuz interface'daki metodu o class'lardan bir nesne oluşturup,  override ederek (metot ezerek) kullanabiliriz
		Student nesne1 = new Student();
		Customer nesne2 = new Customer();
		
		nesne1.log();
		//nesne1.yas = 189;
		// böyle bir atama yapılamaz, sebebi için "IDatabase" isimli interface sayfasına bakın

		nesne2.log();
		

		
		//--------------------------------------------
		// Ayrıca Javada üstteki interface'in referansını alttaki class'lara  atayabiliyoruz.
		// Kısacası üstte yaptığımız gibi class'lardan nesne oluşturmak yerine aşağıdaki gibi
		// IDatabase'in referansından bir nesne oluşturuyoruz.
		
		IDatabase ornek1 = new Student();
		IDatabase ornek2 = new Customer();
		
		ornek1.log();
		ornek2.log();
		
		

	}

}