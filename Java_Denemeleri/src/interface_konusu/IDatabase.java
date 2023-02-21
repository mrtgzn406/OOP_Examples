package interface_konusu;

public interface IDatabase {
	
	void log();
	// interface'lerde bir method olmak zorundadır ve metodun fonksiyon gövdesi de boş olmak zorundadır.
	// Yalnız fonksiyon başlığına parametre yazılabilir.
	
	int yas = 30;
	// interface'lerde böyle primitive (ilkel) veritipleri ile bir değişken oluşturulup ona değer atanabilir ama bu değer 
	// class'lardan veya interface'in referansından nesne oluşturulup sonra da  çağrılıp değiştirilemez, hata verir.
	
	

}
