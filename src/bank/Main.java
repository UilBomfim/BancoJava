package bank;



public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		
		Conta cc = new ContaCorrente(venilton, "01/01/2022");
		Conta poupanca = new ContaPoupanca(venilton, "01/01/2022");
		Conta especial = new ContaEspecial(venilton, "01/03/2022");

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
		
		
		especial.sacar(11000);
		especial.imprimirExtrato();
		
		
	}

}