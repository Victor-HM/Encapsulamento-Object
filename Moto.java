
public class Moto {
	String Modelo;
	String Placa;
	String Cor;
	
	public Moto(String Modelo, String Placa, String Cor) {
        this.Modelo = Modelo;
        this.Placa = Placa;
        this.Cor = Cor;
		}
        
        public void apresentarMoto() {
        	System.out.println("Modelo: " + this.Modelo);
        	System.out.println("Placa: " + this.Placa);
        	System.out.println("Cor: " + this.Cor);
        }
}

