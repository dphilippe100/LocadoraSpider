package models;

public class CopiaFilme {
	
	private int idCopia;
	private Filme filme;

	public CopiaFilme() {
		
	}

	public CopiaFilme(int idCopia, Filme filme) {
		super();
		this.idCopia = idCopia;
		this.filme = filme;
	}

	public int getIdCopia() {
		return idCopia;
	}

	public void setIdCopia(int idCopia) {
		this.idCopia = idCopia;
	}

	public Filme getFilme() {
		return filme;
	}

	public void setFilme(Filme filme) {
		this.filme = filme;
	}
	
	
}
