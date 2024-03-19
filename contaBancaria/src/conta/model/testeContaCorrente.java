package conta.model;

public class testeContaCorrente {
	public static void main(String[] args) {
	contaCorrente contaCorrente1 = new contaCorrente(32, 33, 5, "Thiago", 4000.0f, 3000.0f );
	
	System.out.println("Saldo incial" + contaCorrente1.getSaldo());
	
	contaCorrente1.sacar(8000);
	System.out.println("Saldo atual: " + contaCorrente1.getSaldo());
	}
}
