
public class mainTeste {

	public static void main(String[] args) {
		Caminhao caminhao = new Caminhao("Volks", "XXX-XXXX", "Preto");
		Moto moto = new Moto("Kasawaki", "XXX-XXXX", "Vermelho");
		Carro carro = new Carro("Fiat", "XXX-XXXX", "Preto");
		caminhao.apresentarCaminhao();
		moto.apresentarMoto();
		carro.apresentarCarro();
		

	}

}
