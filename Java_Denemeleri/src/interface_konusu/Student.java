package interface_konusu;

public class Student implements IDatabase{
	// burada "IDatabase" isimli interface'i bu "Student" isimli class'a uyguluyoruz. 
	// Böylece interface içindeki methodu override ederek kullanabiliyoruz.
	
	//Örneğin bizim IDatabase isimli interface'imizde  log(); isminde bir metodumuz var ve class'a o IDatabase isimli interface'i 
	// uygulayınca o class'tan log isimli metodu override edip (metot ezip) çalıştırabiliyoruz
	
	@Override
	public void log() {
		System.out.println("Öğrenci Eklendi...");
	};
}
