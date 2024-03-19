package conta.model;

public class contaCorrente extends Conta {
	
	private float limite;
	public contaCorrente(int numero, int agencia, int tipo, String titular, float saldo, float limite) {
		super(numero, agencia, tipo, titular, saldo);
	
	}
	public float getLimite() {
		return limite;
	}
	public void setLimite(float limite) {
		this.limite = limite;
	}
	
	@Override
	public boolean sacar(float valor) {
		if(this.getSaldo() + this.getLimite() < valor) {
		System.out.println("\n Saldo insulficiente");
		return false;
		}
		this.setSaldo(this.getSaldo() - valor);
		System.out.println("\nValor sacado com sucesso. Use com sabedoria!");
		return true;
	}
	
	
	
	
	

}
