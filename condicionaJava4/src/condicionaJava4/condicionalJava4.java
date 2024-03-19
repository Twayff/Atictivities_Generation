package condicionaJava4;

import java.util.Scanner;

public class condicionalJava4 {
	public static void main (String[] args) {
		
		float num1 = 0.0f;
		float num2 = 0.0f;
		float soma;
		float subtracao;
		float multiplicacao;
		float divisao;
		int codigo = 0;

		Scanner leia = new Scanner(System.in);
		
		System.out.println("Código------------Operação");
		System.out.println("1=================Soma");
		System.out.println("2=================Subtração");
		System.out.println("3=================Multiplicação");
		System.out.println("4=================Divisão");
		System.out.println("Escolha dois números " + num1 + num2);
		codigo = leia.nextInt();
		System.out.println("Escolha uma operação");
		
		
	switch(codigo){
	case 1:
		System.out.println("Soma");
		soma = num1 + num2;
		System.out.println("A soma é igual à " + soma);
		break;
	case 2:
		System.out.println("Subtração");
		subtracao = num1 - num2;
		System.out.println("A subtração é igual à " + subtracao);
	case 3:
		System.out.println("Multiplicação");
		multiplicacao = num1 * num2;
		System.out.println("A multiplicação é igual à " + multiplicacao);
	case 4:
		System.out.println("Divisão");
		divisao = num1 / num2;
		System.out.println("A divisão é igua à " + divisao);
		
		
	}
		
	}
	
	}
