package br.com.exercicio01;

import java.util.Scanner;

public class Programa_01 {
	
	public static void main(String[] args) {
		Agenda agenda = new Agenda();
		
		menu(agenda);
	}
	
	public static void menu(Agenda agenda) {
		System.out.println("=====MENU=====");
		System.out.println("1. Armazenar");
		System.out.println("2. Remover");
		System.out.println("3. Imprimir lista da agenda");
		System.out.println("4. Imprimir pessoa da agenda");
		System.out.println("5. Sair do Menu");
		
		
		String nome;
		
		Scanner sc = new Scanner(System.in);
		int opcao = sc.nextInt();
		switch(opcao) {
			case 1:
				System.out.println("Digite o seu nome: ");
				nome = sc.next();
				
				System.out.println("Digite o sua idade: ");
				int idade = sc.nextInt();
				
				System.out.println("Digite o altura: ");
				float altura = sc.nextFloat();
				
				agenda.armazenaPessoa(nome, idade, altura);
				menu(agenda);
				break;
			case 2:
				System.out.println("Digite o seu nome a ser removido: ");
				nome = sc.next();
				
				agenda.removePessoa(nome);
				menu(agenda);
				break;
			case 3:
				agenda.imprimeAgenda();
				menu(agenda);
				break;
			case 4:
				System.out.println("Digite o indice buscado: ");
				int index = sc.nextInt();
				
				agenda.imprimePessoa(index);
				menu(agenda);
				break;
			case 5:
				break;
		}
	}

	private static void system(String string) {
		// TODO Auto-generated method stub
		
	}
}
