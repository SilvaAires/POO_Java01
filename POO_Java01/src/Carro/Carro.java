package Carro;

public class Carro extends Veiculo{
	
	public void ligar(){
		cambio();
		combustivel();
		System.out.println("Ligado o carro");
	}
	private void combustivel() {
		System.out.println("conferido combustivel");
	}
	private void cambio() {
		System.out.println("conferido cambio");
	}
}
