package interface_konusu_2;

public interface Arayuz {
	void yazdir(String isim, double not);
	// interface' de oluşturulmak zorunda olunan metodun gövdesi boş, fonksiyon başlığı dolu olabilir (parametre alabilir) demiştik
	
	// eğer bir interface içindeki metot parametreye sahipse, o interface'i referans alan ve interface içindeki metodu override eden 
	// bütün class'ların metodu da aynı parametre sayısına sahip olmalı ve parametrelerin veri tipleri, sırası da aynı olmalıdır. 
	// sadece parametrelerin değişken ismi değişebilir fakat asla parametre sayısı, sırası ve tipi değişemez


}
