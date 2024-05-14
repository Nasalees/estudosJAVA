package br.com.exercicio01;

public interface IAgenda {
	void armazenaPessoa(String nome, int idade, float altura);
	
	void removePessoa(String nome);
	
	int buscaPessoa(String name);
	
	void imprimeAgenda();
	
	void imprimePessoa(int index);
}
