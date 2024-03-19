package dadosEstruture;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class dadosEstrutureFila1 {
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList <>();
		
		Scanner leia = new Scanner(System.in);
		
		while(true) {
			System.out.println("-----------  ATENDIMENTO  ------------");
			System.out.println("1- Adicionar um novo Cliente na fila \n");
			System.out.println("2- Listar todos os Clientes na fila \n");
			System.out.println("3- Chamar (retirar) uma pessoa da fila \n");
			System.out.println("0: O programa deve ser finalizado \n");
			System.out.println("****************************************");
			
			System.out.println("Digite uma opção");
			int opcao = leia.nextInt();
			
			switch(opcao) {
			case 1:
				System.out.println("Digite o nome da pessoa para adicionar a mesma na fila");
				leia.nextLine();
				
				String nome = leia.nextLine();
				fila.offer(nome);
				System.out.println(nome + " foi adicionado a lista de espera");
			case 2:
				System.out.println("Os clientes que estão na fila são:" + fila);
				break;
			case 3:
				if(!fila.isEmpty()) {
				String pessoaAtendida = fila.poll();
				System.out.println("Atendimento..." + pessoaAtendida);
				} else {
				System.out.println("Não há nimguém na fila...");
				}
				break;
			case 0:
				System.out.println("Atendimento finalizado");
				leia.close();
				System.exit(0);
				break;
			default:
				System.out.println("Opção incorreta!");
				break;
				
			}
			
			
			
			
			
		}
		
		
	}

}
