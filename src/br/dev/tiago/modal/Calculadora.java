package br.dev.tiago.modal;

public class Calculadora {

	public void verificarX(int recebeX) {

		recebeX = (recebeX % 2 == 0) ? recebeX + 5 : recebeX * 2;
		System.out.println(recebeX);

	}

}
