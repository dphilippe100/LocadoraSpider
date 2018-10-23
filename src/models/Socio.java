package models;

public class Socio {

	//DECLARAÇÃO DOS ATRIBUTOS DA CLASSE 
	private String nome;
	private String rg;
	private String cpf;
	private String endereco;
	private long telefone;
	private String adesao;

	
	//CONSTRUTOR VAZIO DA CLASSE
	public Socio() {
		
	}
	
	//CONSTRUTOR COM TODOS OS ATRIBUTOS DA CLASSE
	public Socio(String nome, String rg, String cpf, String endereco, long telefone, String adesao) {
		super();
		this.nome = nome;
		this.rg = rg;
		this.cpf = cpf;
		this.endereco = endereco;
		this.telefone = telefone;
		this.adesao = adesao;
	}

	//MÉTODOS GETTERS DE TODOS OS ATRIBUTOS DA CLASSE
	public String getNome() {
		return nome;
	}

	public String getRg() {
		return rg;
	}

	public String getCpf() {
		return cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public long getTelefone() {
		return telefone;
	}

	public String getAdesao() {
		return adesao;
	}

}
