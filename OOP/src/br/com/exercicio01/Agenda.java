package br.com.exercicio01;

import java.util.List;
import java.util.ArrayList;

public class Agenda implements IAgenda {
	private final int MAX_QTD_PESSOA = 10;
	
	private List<Pessoa> pessoas;

	public Agenda() {
		this.pessoas = new ArrayList<>(MAX_QTD_PESSOA);
	
	}

	//CREATE
	@Override
	public void armazenaPessoa(String nome, int idade, float altura) {
		if (this.pessoas.size() < 10) {
			Pessoa pessoa = new Pessoa(nome, idade, altura);
			this.pessoas.add(pessoa);
		} else {
			System.out.println("A agenda está lotada!");
		}
	}
	
	//REMOVE
	@Override
	public void removePessoa(String nome) {
		this.pessoas.remove(this.buscaPessoa(nome));
	}

	
	@Override
	public void imprimeAgenda() {
		this.pessoas.forEach(System.out::println);
	}
	
	@Override
	public int buscaPessoa(String name) {
		for (int i = 0; i < this.pessoas.size(); i++) {
			Pessoa pessoa = this.pessoas.get(i);
			if (pessoa.getNome().equals(name)) {
				return i;
			}
		}

		return -1;
	}

	@Override
	public void imprimePessoa(int index) {
		System.out.println(this.pessoas.get(index).toString());
	}
}
