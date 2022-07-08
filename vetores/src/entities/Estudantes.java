package entities;

public class Estudantes {
	public Estudantes(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}
	private String nome;
	private String email;
	
	public String toString() {
		return nome + ", " + email;
	}
}
