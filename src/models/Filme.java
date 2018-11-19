package models;

public class Filme {

	// DECLARAÇÃO DOS ATRIBUTOS DA CLASSE
	private String titulo;
	private String duracao;
	private int lancamento;
	private String formato;
	private String atores;

	// CONSTRUTOR VAZIO
	public Filme() {

	}

	// CONSTRUTOR COM TODOS OS ATRIBUTOS DA CLASSE
	public Filme(String titulo, String duracao, int lancamento, String formato) {
		super();
		this.titulo = titulo;
		this.duracao = duracao;
		this.lancamento = lancamento;
		this.formato = formato;
	}

	//MÉTODOS GETTERS DE TODOS OS ATRIBUTOS DA CLASSE
	public String getTitulo() {
		return titulo;
	}

	public String getDuracao() {
		return duracao;
	}

	public int getLancamento() {
		return lancamento;
	}

	public String getFormato() {
		return formato;
	}

	public String getAtores() {
		return atores;
	}


}
