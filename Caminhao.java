
public class Caminhao {
	private String Modelo;
	private String Placa;
	private String Cor;
	
	public Caminhao(String Modelo, String placa, String cor) {
        this.Modelo = Modelo;
        this.Placa = Placa;
        this.Cor = Cor;
    }
	public String getModelo() {
        return Modelo;
    }
    public void setModelo (String Modelo) {
        this.Modelo = Modelo;
    }
    public String getPlaca() {
        return Placa;
    }
    public void setPlaca (String Placa) {
        this.Placa = Placa;
    }
    public String getCor() {
        return Cor;
    }
    public void setCor (String Cor) {
        this.Cor = Cor;
    }
    public void apresentarCaminhao() {
    	System.out.println("Modelo: " + this.getModelo());
    	System.out.println("Placa: " + this.getPlaca());
    	System.out.println("Cor: " + this.getCor());
    }
}
