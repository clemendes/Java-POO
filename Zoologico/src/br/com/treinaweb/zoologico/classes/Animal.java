package br.com.treinaweb.zoologico.classes;

// CLASSE PUBLICA
// CLASSE ABSTRATA - NAO PODE SER INSTANCIADA DIRETAMENTE
public abstract class Animal implements Animavel {
	
	// GERALMENTE TODA CLASSE CONT�M:
	// -> PROPRIEDADES/ATRIBUTOS
	// -> M�TODOS
	// EXEMPLO: NOME, ESP�CIE, IDADE
	
	// EXEMPLO DE ENCAPSULAMENTO
	// ATRIBUTOS PRIVADOS 
	private String nome;
	private String especie;
	protected int idade;
	protected boolean EstaVivo;
	
// -----------------------------------------------------	
// 			MET�DOS ACESSORES
// 				GET | SET
	
	// getNome() - RETORNO
	public String getNome() {
		return nome;
	}
	
	// setNome(x) - SEM RETORNO - COM PARAMETRO
	public void setNome(String nome) {
		// QUALIFICADOR = THIS
		this.nome = nome;
	}
	
	// getEspecie() - RETORNO
	public String getEspecie() {
		return especie;
	}
	
	// setEspecie(x) - SEM RETORNO - COM PARAMETRO
	public void setEspecie(String especie) {
		// QUALIFICADOR = THIS
		this.especie = especie;
	}
	
	// getIdade() - RETORNO
	public int getIdade() {
		return idade;
	}
	
	// setIdade(x) - SEM RETORNO - COM PARAMETRO
	public void setIdade(int idade) {
		// QUALIFICADOR = THIS
		this.idade = idade;
	}
	
	
	// getestaVivo() - SEM RETORNO - COM PARAMETRO
	public boolean getEstaVivo() {
		return EstaVivo;
	}
	
// -----------------------------------------------------
//		M�TODO CONSTRUCTOR
	
	public Animal(String nome, int idade, String especie) {
		this.nome = nome;
		this.idade = idade;
		this.especie = especie;
		this.EstaVivo = true;
	}

//	OUTRO M�TODO CONSTRUCTOR - SOBRECARGA
	// ASSINATURAS DIFERENTES
	public Animal(String nome) {
		this.nome = nome;
		this.EstaVivo = true;
	}
	
// -----------------------------------------------------
// 			M�TODOS PARA O OBJETO ANIMAL
	
	//public void emitirBarulho() {
	//	System.out.println("Barulho do Animal");
	//}
	
	// M�TODO ABSTRATO - IRA UTILIZAR O METODO IMPLEMENTADO EM CADA CLASSE
	public abstract void emitirBarulho();
	
	public boolean ehAdulto() {
		if (EstaVivo) {
			return idade >=1;
		} else {
			return false;
		}
	}
	
	// M�TODO PUBLIC FINAL - NAO PODE SER SOBRESCRITO
	public final void morrer() {
		this.EstaVivo = false;
	} 
	
// -----------------------------------------------------	
	
}