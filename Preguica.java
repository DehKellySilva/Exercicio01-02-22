package exercicioJava;

public class Preguica extends Animais{
	
	private String especie;
	private String genero;
	
	public Preguica(String nome,String idade,String som,String habilidade,String especie,String genero)
	{
		super(nome,idade,som,habilidade);
		this.especie = especie;
		this.genero = genero;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public void imprimirInfo() {
		System.out.println("\nA esp�cie do animal �: "+getNomeAnimais()+"\nA sua idade �: "
				+getIdade()+"\nO som que ele emite �: "
			+getSom()+"\nEle corre ou sobe em �rvores: "+getHabilidade()+"\nQual a esp�cie: "+especie+
			"\nQual o gen�ro: "+genero);
	}

}
