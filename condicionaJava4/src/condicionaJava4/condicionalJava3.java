package condicionaJava4;

import java.util.Scanner;

public class condicionalJava3 {
	public static void main(String[] args) {
		
		double valor = 0.0;
		int cardapio;
		int quantidade = 0;
		double resultado = 0.0;
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("-------------MENU------------");
		System.out.println("Código do produto-------------Produto-----------Preço unitário");
		System.out.println("1=========================Cachorro Quente=======R$10,00");
		System.out.println("2=========================X-Salada==============R$15,00");
		System.out.println("3=========================X-Bacon===============R$18,00");
		System.out.println("4=========================Bauru=================R$12,00");
		System.out.println("5=========================Refrigerante==========R$8,00");
		System.out.println("6=========================Suco de laranja=======R$13,00");
		System.out.println("Qual produto você deseja?");
		cardapio = leia.nextInt();
		
		switch (cardapio) {
		case 1:
			System.out.println("Cachorro quente");
			valor = 10.00;
			System.out.println("R$" + valor);
			break;
		case 2:
			System.out.println("X-Salada");
			valor = 15.00;
			System.out.println("R$" + valor);
			break;
		case 3:
			System.out.println("X-Bacon");
			valor = 18.00;
			System.out.println("R$" + valor);
			break;
		case 4:
			System.out.println("Bauru");
			valor = 12.00;
			System.out.println(valor);
			break;
		case 5:
			System.out.println("Refrigerante");
			valor = 8.00;
			System.out.println("R$" + valor);
			break;
		case 6:
			System.out.println("Suco de laranja");
			valor = 13.00;
			System.out.println("R$" + valor);
			break;
		
		}
		System.out.println("Quantos produtos você deseja comprar?");
		quantidade = leia.nextInt();
		
		System.out.println("Você pagará:R$" + resultado);
		resultado = valor * quantidade;
		
		
}
	


}
