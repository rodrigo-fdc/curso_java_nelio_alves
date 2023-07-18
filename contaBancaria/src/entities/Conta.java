package entities;

public class Conta {
	
	private int numeroConta;
	private String nome;
	private double saldo;
	
	public Conta(int numeroConta, String nome, double depositoInicial) {
		this.numeroConta = numeroConta;
		this.nome = nome;
		depositar(depositoInicial);
	}
	
	public Conta(int numeroConta, String nome) {
		this.numeroConta = numeroConta;
		this.nome = nome;
	}
	
	public int getNumeroConta() {
		return numeroConta;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void depositar(double quantia) {
		this.saldo += quantia;
	}
	
	public void sacar(double quantia) {
		this.saldo -= quantia+5.00;
	}
	
	public String toString() {
		return "Account "
				+ numeroConta
				+ ", Holder: "
				+ nome
				+ ", Balance: $ "
				+ saldo;
	}
}
