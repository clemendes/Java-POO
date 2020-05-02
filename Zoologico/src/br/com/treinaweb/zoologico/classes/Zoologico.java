package br.com.treinaweb.zoologico.classes;

import java.util.ArrayList;
import java.util.List;

public class Zoologico {
	
	private String nome;
	private List<Animal> animais;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Zoologico() {
		animais = new ArrayList<Animal>();
	}
	
	public void addAnimal (Animal animalASerAdicionado) {
		animais.add(animalASerAdicionado);
	}
	
	public void delAnimal (int IndiceDoAnimal) {
		animais.remove(IndiceDoAnimal);
	}
	
	public void listAnimais ( ) {
		System.out.println("Animais do Zoologico: ");
		for (int i=0;i<animais.size();i++) {
			System.out.println(animais.get(i).getNome() + "-");
		}
	}

}
