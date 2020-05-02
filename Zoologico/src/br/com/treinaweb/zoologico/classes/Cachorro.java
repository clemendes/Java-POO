package br.com.treinaweb.zoologico.classes;

// EXTENDS = HERANÇA CLASSE
public class Cachorro extends Animal {

	public Cachorro(String nome) {
		super(nome);
	}
	
	// SOBRECARGA DE CONSTRUTOR - CLASSE FILHA
	public Cachorro(String nome, int idade, String especie) {
		super(nome, idade, especie);
	}
	
	// SOBRECARGA DE CONSTUTOR PERSONALIZADO 
	public Cachorro(String nome, int idade) {
		super(nome, idade, "Cachorro");
	}

	@Override
	public void emitirBarulho() {
		if (EstaVivo) {
			System.out.println("Latido do Cachorro");	
		} else {
			System.out.println("Cachorro morreu");
		}	
	}
	
	@Override
	public boolean ehAdulto() {
		if(EstaVivo) {
			return idade>2;
		} else {
			return false;
		}
	}

}