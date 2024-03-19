package loopRepetiçãoExercício;

import java.util.Scanner;

public class loopRepetição1 {
	public static void main(String[] args) {
		
		int num1 = 0;
		int num2 = 0;
		int contador;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Escolha o primeiro numero:");
		num1 = leia.nextInt();
		System.out.println("Escolha o segundo número:");
		num2 = leia.nextInt();
		
		if(num1 < num2) {
		
			for(contador = num1; contador < num2; contador++) {
				if(contador % 5 == 0 && contador % 3 == 0) {
				System.out.println(contador + " é múltiplo de 3 e 5");
			} else {
				System.out.println("o intervalo é inválido");
			}
			}
		}
		}
	
	
	
}
