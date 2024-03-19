package condicionaJava4;
import java.util.Scanner;

public class condicionalJava2 {
	
	public static void main(String[] args) {
		
		
			String nome;
			int idade;
			boolean doacao = true;
			Scanner leia = new Scanner(System.in);
			
			
			
			System.out.println("Digite o Nome do doador: ");
			nome = leia.next();
			System.out.println("Digite a Idade do doador: ");
			idade = leia.nextInt();
			System.out.println("Primeira doação de sangue? ");
			doacao = leia.nextBoolean();
			
			
			if(idade >= 18 && idade <= 59) {
				System.out.println(nome + " está apto para doar");
			if(idade >= 60 && idade <=69 && doacao == true);
				System.out.println(nome + " está apto para doar");
			}else{
				System.out.println(nome + " não está apto para dora");

				
			}
			
			

		}

	}


