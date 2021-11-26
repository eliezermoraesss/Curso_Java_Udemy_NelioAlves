package entities;

public class BankAccount {
	
	private int numeroConta;
	private String nomeTitular;
	private double saldo;
	final double TAXA_SAQUE = 5.00;
	
	public BankAccount() {
		
	}
	
	public BankAccount(int numeroConta, String nomeTitular, double valorInicial) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		deposito(valorInicial);
	}
	
	public BankAccount(int numeroConta, String nomeTitular) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
	}
	
	public void deposito(double valorDeposito) {		
		saldo += valorDeposito;
	}
	
	public void saque(double valorSaque) {
		saldo -= valorSaque + TAXA_SAQUE;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public double getSaldo() {
		return saldo;
	}

	@Override
	public String toString() {
		return "Account " 
				+ numeroConta 
				+ ", Holder: " 
				+ nomeTitular 
				+ ", Balance: $ " 
				+ String.format("%.2f", saldo);
	}
	
	
}
