package exercicioJava;

public class Animais {
	
	private String nomeAnimais;
	private String idade;
	private String som;
	private String habilidade;
	
	public Animais(String nomeAnimais,String idade,String som,String habilidade)
	{
		super();
		this.nomeAnimais = nomeAnimais;
		this.idade = idade;
		this.som = som;
		this.habilidade = habilidade;
	}

	public String getNomeAnimais() {
		return nomeAnimais;
	}

	public void setNomeAnimais(String nomeAnimais) {
		this.nomeAnimais = nomeAnimais;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
	}

	public String getHabilidade() {
		return habilidade;
	}

	public void setHabilidade(String habilidade) {
		this.habilidade = habilidade;
	}
	
	public void imprimirInfo()
	{
		System.out.println("\nA espécie do animal é: "+nomeAnimais+"\nA sua idade é: "+idade+"\nO som que ele emite é: "+som+"\nEle corre ou sobe em árvores: "+habilidade);
	}

}
