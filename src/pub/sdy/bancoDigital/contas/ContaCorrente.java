package pub.sdy.bancoDigital.contas;

import pub.sdy.bancoDigital.clientes.Cliente;

public class ContaCorrente extends Conta{
	
	public ContaCorrente(Cliente proprietario) {
		super(proprietario);
	}

	public void imprimirExtrato() {
		System.out.println("================================");
		System.out.println("==== Extrato Conta Corrente ====");
		System.out.println("================================");
		System.out.println("==== Proprietario: "+ getProprietario().getNomeCliente());
		System.out.println("==== Agencia: "+agencia);
		System.out.println("==== Numero Conta: "+numConta);
		System.out.println("==== Saldo: "+saldo);
	}
}
