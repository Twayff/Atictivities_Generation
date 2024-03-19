package loopRepetiçãoExercício;

import java.util.Scanner;

public class loopRepetição3 {
	public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        
        
        int soma = 0;
        
        int num;
        do {
            System.out.println("Digite um número:");
            num = leia.nextInt();
            
           
            if (num > 0 || num < 0) {
                soma += num;
            }
            
        } while (num != 0);
        
        
        System.out.println("\nA soma dos números positivos é igual à: " + soma);
        
        
        leia.close();
    }
}
