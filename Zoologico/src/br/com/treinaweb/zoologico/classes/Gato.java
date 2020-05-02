package br.com.treinaweb.zoologico.classes;

public class Gato extends Animal {
	
	// SOBRECARGA DE CONSTRUTOR - CLASSE FILHA
	public Gato(String nome, int idade, String especie) {
		super(nome, idade, especie);
	}

	@Override
	public void emitirBarulho() {
		if (EstaVivo) {
			System.out.println("Miado do Gato");
		} else {
			System.out.println("Gato morreu");
		}
	}
}
