package Banco;

public class Main {
	
	public static void main (String[]args) {
		Conta cc = new ContaCorrente(null);
		cc.depositar(100);
		
		Conta poupanca = new ContaPoupanca(null);
		poupanca.depositar(25);
		
		cc.transferir (100,poupanca);
		
		cc.imprimirExtrato(); 
		poupanca.imprimirExtrato();
		
		}

}
