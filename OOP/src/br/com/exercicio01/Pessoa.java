package br.com.exercicio01;

public class Pessoa {
	private String nome;
	private int idade;
	private float altura;
	
	public Pessoa(String nome, int idade, float altura) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}
	
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
	
	public double getAltura() {
		return this.altura;
	}
	
	public void setAltura(float altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", altura=" + altura + "]";
	}
}
