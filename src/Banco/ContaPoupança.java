package Banco;

public class ContaPoupanša extends Conta {
	
	public ContaPoupanša(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	public void imprimirExtrato() {
		
		System.out.println("**** Extrato Conta Poupanša ***");
		super.ImprimirInformacoesComum();
	}	
}
