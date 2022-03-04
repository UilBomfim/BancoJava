package bank;

import java.util.Calendar;

public class ContaEspecial extends Conta {
	
	
	private double limite = 10000;

	public ContaEspecial(Cliente cliente, String dataAbertura) {
		super(cliente, dataAbertura);
		this.saldo += limite;
	}
	
	public double getLimite() {
		return limite;
	}
	
	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	/*@Override
	public void sacar(double valor) {
		
		double novoSaldo = this.getSaldo() - valor;
		
		if (valor <= (this.saldo + this.limite)) {
			this.saldo = novoSaldo;
		} else {
			System.out.println("Saldo insuficiente");
		}
	}
	
	@Override
	public double getSaldo() {
		return this.saldo + this.getLimite();
	}*/

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Especial ===");
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Data de Abertura: %s", this.getDataAbertura()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo + limite: %.2f", this.saldo));
	}
	
	
	
}