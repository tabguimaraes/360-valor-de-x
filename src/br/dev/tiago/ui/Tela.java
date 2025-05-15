package br.dev.tiago.ui;

import java.util.Scanner;

import br.dev.tiago.modal.Calculadora;

public class Tela {

	Scanner scanner = new Scanner(System.in);

	public void entradaDeDados() {
		Calculadora calculadora = new Calculadora();

		System.out.print("Digite um número: ");
		calculadora.verificarX(Integer.parseInt(scanner.nextLine()));

		scanner.close();
	}

}