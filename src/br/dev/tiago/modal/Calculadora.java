package br.dev.tiago.modal;

public class Calculadora {

	public void verificarX(int valorDeX) {

		valorDeX = (valorDeX % 2 == 0) ? valorDeX + 5 : valorDeX * 2;
		System.out.println(valorDeX);

	}

}
