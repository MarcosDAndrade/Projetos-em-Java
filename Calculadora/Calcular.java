package Calculadora;

import java.util.Scanner;

public class Calcular {
	public int n1;
	public int n2;

	Calcular() {

	}

	Calcular(int n1, int n2) {
		this.n1 = n1;
		this.n2 = n2;

	}

	public void calcular() {
		int opc = 0;
		do {
			Scanner leia = new Scanner(System.in);
			System.out.println("Digite o primeiro número: ");
			n1 = leia.nextInt();
			System.out.println("Digite o segundo número: ");
			n2 = leia.nextInt();

			System.out.println("Qual operação deseja: ");
			System.out.println("1- Soma");
			System.out.println("2- Subtração");
			System.out.println("3- Divisão");
			System.out.println("4- Multiplicação");
			opc = leia.nextInt();

			switch (opc) {
			case 1:
				System.out.println("O valor é: " + somar());
				break;
			case 2:
				System.out.println("O valor é: " + subtrair());
				break;
			case 3:
				System.out.println("O valor é: " + dividir());
				break;
			case 4:
				System.out.println("O valor é: " + multiplicar());
				break;
			}
			System.out.println("------------------");
			System.out.println("Deseja continuar?: ");
			System.out.println("1-Continuar" + "\n2-Fechar");
			System.out.println("------------------");
			opc = leia.nextInt();
		} while (opc == 1);
		System.out.println("FIM DO PROGRAMA!");

	}

	public int somar() {
		return n1 + n2;
	}

	public int subtrair() {
		return n1 - n2;
	}

	public double dividir() {
		return n1 / n2;
	}

	public int multiplicar() {
		return n1 * n2;
	}

	public int getN1() {
		return n1;
	}

	public void setN1(int n1) {
		this.n1 = n1;
	}

	public int getN2() {
		return n2;
	}

	public void setN2(int n2) {
		this.n2 = n2;
	}
}
