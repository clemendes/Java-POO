package br.com.treinaweb.zoologico.app;

//REFERENCIANDO TODAS AS CLASSES CONTIDAS NO PACOTE CLASSES
import br.com.treinaweb.zoologico.classes.*;

public class Programa {

	public static void main(String[] args) {
		
		// Cachorro = Instancia (variavel) criada a partir da classe Animal
		// Ter� todas as caracter�sticas e m�todos contidos na classe Animal
		// Cachorro = Objeto do tipo Animal
		
		// M�todo Constructor Personalizado - Completo
		//Animal animal = new Cachorro("Ringo", 2, "Cachorro"); 
		Animal animal = new Gato("Tot�", 2, "Gato"); 
		
		// Utilizando Metodo Get
		System.out.println("Ol� seu animal � : " + animal.getEspecie());
		System.out.println("O nome do animal �: " + animal.getNome());
		System.out.println("A Idade do animal �: " + animal.getIdade());
		
		if(animal.ehAdulto()) {
			System.out.println("ADULTO");
		} else {
			System.out.println("FILHOTE");
		}
		
		System.out.print("BARULHO DO CACHORRO: ");
		animal.emitirBarulho();
		
		System.out.println("--------------------------------------------");

		System.out.println("******* DEPOIS MORRER **********************");
		
		animal.morrer();
		
		System.out.print("BARULHO DO CACHORRO: ");
		animal.emitirBarulho();
		
		System.out.println("***********ZOOLOGICO ***********");
		
		Zoologico zoo = new Zoologico();
		zoo.setNome("Zoo TreinaWeb");
		zoo.addAnimal(animal);
		Animal animal2 = new Gato("Z�", 3, "Gato");
		zoo.addAnimal(animal2);
		System.out.println("Animais do Zoologico TreinaWeb");
		zoo.listAnimais();
		zoo.delAnimal(0);
		System.out.println("Depos da Remo��o: ");
		zoo.listAnimais();
		
		System.out.println("***********VETERINARIO ***********");
		
		Veterinario vet = new Veterinario();
		vet.setNome("Veter TreinaWeb");
		vet.atenderAnimal(animal);
		vet.listaAnimaisAtendidos();
	}
}
