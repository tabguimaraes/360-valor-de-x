package br.dev.tiago.ui;

import java.util.Scanner;

import br.dev.tiago.modal.Calculadora;

public class Tela {

	Scanner scanner = new Scanner(System.in);
	int recebeX;

	public void entradaDeDados() {
		System.out.print("Digite um número: ");
		recebeX = Integer.parseInt(scanner.nextLine());

		Calculadora calculadora = new Calculadora();
		calculadora.verificarX(recebeX);

		scanner.close();
	}

}