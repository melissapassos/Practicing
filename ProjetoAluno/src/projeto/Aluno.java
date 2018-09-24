package projeto;

public class Aluno {

	protected String nome;
	protected int idade;
	private double nota;
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public double getNota() {
		return this.nota;
	}
	
	public void setNota(double nota) {
		this.nota = nota;
	}
	
	public Aluno() {
		this.nome = "Nome Padrão";
		this.idade = 0;
		this.nota = 0.0;
	}
	
	public Aluno(String nome, int idade, double nota) {
		this.nome = nome;
		this.idade = idade;
		this.nota = nota;
	}
}
