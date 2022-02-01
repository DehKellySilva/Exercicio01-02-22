package exercicioJava;

public class Cavalo extends Animais{ 
	
	private String raca;
	private String genero;
	private String cor;
	
	public Cavalo(String nome,String idade,String som,String habilidade,String raca,String genero,String cor)
	{
		super(nome,idade,som,habilidade);
		this.raca = raca;
		this.genero = genero;
		this.cor = cor;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public void imprimirInfo() {
		System.out.println("\nA espécie do animal é: "+getNomeAnimais()+"\nA sua idade é: "
				+getIdade()+"\nO som que ele emite é: "
			+getSom()+"\nEle corre ou sobe em árvores: "+getHabilidade()+"\nQual a raça: "
				+raca+"\nQual o genêro: "+genero+"\nCor do cavalo: "+cor);
	}
}
