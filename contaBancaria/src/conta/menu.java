package conta;

import java.util.Scanner;

import cinta.controller.ContaController;
import conta.model.contaCorrente;
import conta.model.contaPoupanca;
import conta.util.Cores;





public class menu {
	public static void main(String[] args) {
		
		ContaController contas = new ContaController();
		
		
		
		Scanner leia = new Scanner(System.in);
		
		int opcao, numero, agencia, tipo, aniversario;
		String titular;
		float saldo , limite;
	

	
//Teste da classe contaCorrente
		contaCorrente cc1 = new contaCorrente(1, 123, 1, "Adriana", 10000.0f, 1000.0f);
		cc1.visualizar();
		cc1.sacar(12000.0f);
		cc1.visualizar();
		cc1.depositar(5000.0f);
		cc1.visualizar();
//Teste da classe contaPoupanca
		
		contaPoupanca cp1 = new contaPoupanca(2, 123, 2, "Victor", 100000.0f, 15);
		cp1.visualizar();
		cp1.sacar(1000.0f);
		cp1.visualizar();
		cp1.depositar(5000.0f);
		cp1.visualizar();
	
	
	while(true) {
		
		System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND + "********************************************");
		System.out.println("                                           ");
		System.out.println("          BANCO DO BRAZIL COM Z            ");
		System.out.println("                                           ");
		System.out.println("********************************************");
		System.out.println("                                           ");
		System.out.println("1 - Criar Conta                            ");
		System.out.println("2 - Listar Todas as Contas                 ");
		System.out.println("3 - Buscar Conta por Número                ");
		System.out.println("4 - Atualizar Dados da Conta               ");
		System.out.println("5 - Apagar Conta                           ");
		System.out.println("6 - Sacar                                  ");
		System.out.println("7 - Depositar                              ");
		System.out.println("8 - Transferir valores entre Contas        ");
		System.out.println("9 - Sair                                   ");
		System.out.println("                                           "); 
		System.out.println("********************************************");
		System.out.println("Entre com a opção desejada:                ");
		System.out.println("                                           ");
		int opcao = leia.nextInt();
		
		if(opcao == 9) {
			System.out.println("\nBanco do Brazil com Z - O seu futuro começa aqui!");
            sobre();
			leia.close();
			System.exit(0);
		}
		switch(opcao) {
		case 1:
			System.out.println(Cores.TEXT_WHITE_BRIGHT + "\n Criar Conta");
			
			System.out.println("Digite o número da agência:");
			agencia = leia.nextInt();
			System.out.println("Digite o nome do títular:");
			leia.skip("\\R?");
			titular = leia.nextLine();
			
		
			do {
				System.out.println("Digite o tipo da conta: (1-CC ou 2-CP): ");
				tipo = leia.nextInt();
			
			
			}while() {
				
			}
			
			
//			keyPress();
             break;
		
		case 2:
			System.out.println(Cores.TEXT_WHITE_BRIGHT + "\n Listar todas as Contas");
			contas.listarTodas();
             
			break;
		case 3:
			System.out.println(Cores.TEXT_WHITE_BRIGHT + "\n Buscar Conta por número");
			
			break;
		case 4:
			System.out.println("\n Atualizar dados da Conta");
			
             break;
		case 5:
			System.out.println("\n Apagar Conta");
			
             break;
		case 6:
			System.out.println("\n Sacar");
			
			break;
         case 7:
			System.out.println("\n Depositar");
			
			break;
         case 8:
			System.out.println("\n Transferir");
			
			break;
		default:
			System.out.println("\nOpção Inválida");
             break;
		}
		
	}
	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: ");
		System.out.println("Generation Brasil - generation@generation.org");
		System.out.println("github.com/conteudoGeneration");
		System.out.println("*********************************************************");
	
	
	

	}
}

	

