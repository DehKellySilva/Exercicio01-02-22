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
		System.out.println("\nA esp�cie do animal �: "+getNomeAnimais()+"\nA sua idade �: "
				+getIdade()+"\nO som que ele emite �: "
			+getSom()+"\nEle corre ou sobe em �rvores: "+getHabilidade()+"\nQual a ra�a: "
				+raca+"\nQual o gen�ro: "+genero+"\nCor do cavalo: "+cor);
	}
}
