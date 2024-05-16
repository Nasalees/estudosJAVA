package br.com.nathalia.exercicio03;

import java.util.Scanner;


public class Elevador {
	private static final int MAX = 10;
	private static final int MAX_CAPACIDADE = 10;
	private int totalDeAndares = MAX;
	private int andarAtual = 0;
	private int capacidadeDoElevador;
	private int qtPessoasNoElevador;
	
	Scanner sc = new Scanner(System.in);
	
	//Comportamentos;
	public Elevador(int totalDeAndares, int andarAtual,int capacidadeDoElevador, int qtPessoasNoElevador) {
		this.totalDeAndares = totalDeAndares;
		this.andarAtual = andarAtual;
		this.capacidadeDoElevador = capacidadeDoElevador;
		this.qtPessoasNoElevador = qtPessoasNoElevador;
	}
	
	public void inicializa(int capacidadeDoElevador, int totalDeAndares, int andarAtual) {
		if(totalDeAndares == 0 && capacidadeDoElevador == 0) {
			
		}
	}
	
	public void entra() {
		if(capacidadeDoElevador == MAX) {
			System.out.println("Elevador em sua capacidade máxima!");
		}else {
			
		}
	}
	
	public void sai(int capacidadeDoElevador) {
		if(capacidadeDoElevador == 0) {
			System.out.println("O elevador está vazio!");
		}
	}
	
	public void sobe() {
		if(andarAtual == MAX) {
			System.out.println("O Elevador está no último andar!");
		}
	}
	
	public void desce() {
		if(andarAtual == 1) {
			System.out.println("O Elevador está no primeiro andar!");
		}
	}
	
	
	//Getters e Setteres;
	
			public int getTotalDeAndares() {
				return this.totalDeAndares;
			}
			
			public void setTotalDeAndares(int totalDeAndares) {
				this.totalDeAndares = totalDeAndares;
			}
			
			public int getAndarAtual() {
				return this.andarAtual;
			}
			
			public void setAndarAtual(int andarAtual) {
				this.andarAtual = andarAtual;
			}
			
			public int getCapacidadeDoElevador() {
				return this.capacidadeDoElevador;
			}
			
			public void setCapacidadeDoElevador(int capacidadeDoElevador) {
				this.capacidadeDoElevador = capacidadeDoElevador;
			}
			
			public int qtPessoasNoElevador() {
				return this.qtPessoasNoElevador;
			}
			
			public void setPessoasNoElevador(int qtPessoasNoElevador) {
				this.qtPessoasNoElevador = qtPessoasNoElevador;
			}
	
	
}
