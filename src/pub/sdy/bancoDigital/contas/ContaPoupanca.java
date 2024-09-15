package pub.sdy.bancoDigital.contas;

import pub.sdy.bancoDigital.clientes.Cliente;

public class ContaPoupanca extends Conta{

	public ContaPoupanca(Cliente proprietario) {
		super(proprietario);
	}

	public void imprimirExtrato() {
		System.out.println("=================================");
		System.out.println("====  Extrato Conta Pupanca  ====");
		System.out.println("=================================");
		System.out.println("==== Proprietario: "+ getProprietario().getNomeCliente());
		System.out.println("==== Agencia: "+agencia);
		System.out.println("==== Numero Conta: "+numConta);
		System.out.println("==== Saldo: "+saldo);
	}

}
