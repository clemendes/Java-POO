package br.com.treinaweb.calculadora.principal;

import br.com.treinaweb.calculadora.interfaces.CalculadorMatematico;

public class App {

	public static void main(String[] args) {
		
		String calculo = "^";
		int numero1 = 2;
		int numero2 = 3;
		
		Calculadora calculadora = new Calculadora();
		CalculadorMatematico calculador = calculadora.calculadora(numero1, numero2, calculo);
		
		if (calculador!=null) {
			System.out.println(calculador.calcular());
		} else {
			System.out.println("Calculo inválido!");
		}
		
	}

}