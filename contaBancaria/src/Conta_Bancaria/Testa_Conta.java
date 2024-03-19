package Conta_Bancaria;

public class Testa_Conta {

	public static void main(String[] args) {
		
		ContaBancaria novaConta = new ContaBancaria();
		
		novaConta.setNumero(32);
		novaConta.setAgencia(455);
		novaConta.setTipo(2);
		novaConta.setTitular("Thiago");
		novaConta.setSaldo(2500);
		
		System.out.println("Número da Conta " + novaConta.getNumero());
		System.out.println("Número da Agência " + novaConta.getAgencia());
		System.out.println("Tipo da conta " + novaConta.getTipo());
		System.out.println("Titular da conta " +novaConta.getTitular());
		System.out.println("Saldo da conta " + novaConta.getSaldo());
		
		
		
		

	}

}
