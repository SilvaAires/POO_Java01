package Carro;

public class Autodromo {

	public static void main(String[] args) {
		Carro jeep = new Carro();
		jeep.ligar();
		Moto m = new Moto();
		jeep.setChassi("122");
		m.setChassi("123");
		m.ligar();
		
	}

}
