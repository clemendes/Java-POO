package br.com.treinaweb.calculadora.classes;

import br.com.treinaweb.calculadora.interfaces.CalculadorMatematico;

public abstract class CalculoMatematico implements CalculadorMatematico {

	// ATRIBUTOS
	protected int numero1;
	protected int numero2;

	// CONSTRUCTOR
	public CalculoMatematico(int numero1, int numero2) {
		this.numero1 = numero1;
		this.numero2 = numero2;
	}

	@Override
	public boolean validar() {

		return numero1 >= 0 && numero2 >= 0;
	}

	// TEMPLATE METHOD
	@Override
	public final int calcular() {
		if (validar()) {
			return doCalcular();
		} else {
			return -1;
		}
	}

	protected abstract int doCalcular();

}
