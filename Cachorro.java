package exercicioJava;

public class Cachorro extends Animais {

	private String raca;
	private String porte;
	private String comportamento;
	
	public Cachorro(String nome,String idade,String som,String habilidade,String raca,String porte,String comportamento)
	{
		super(nome,idade,som,habilidade);
		this.raca = raca;
		this.porte = porte;
		this.comportamento = comportamento;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getPorte() {
		return porte;
	}

	public void setPorte(String porte) {
		this.porte = porte;
	}

	public String getComportamento() {
		return comportamento;
	}

	public void setComportamento(String comportamento) {
		this.comportamento = comportamento;
	}
	
	public void imprimirInfo() {
		System.out.println("\nA espécie do animal é: "+getNomeAnimais()+"\nA sua idade é: "
	+getIdade()+"\nO som que ele emite é: "
	+getSom()+"\nEle corre ou sobe em árvores: "+getHabilidade()+"\nQual a raça: "+raca+
	"\nQual o porte: "+porte+"\nQual o comportamento: "+comportamento);
	}
}
