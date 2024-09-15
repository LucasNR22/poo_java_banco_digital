package pub.sdy.bancoDigital;

import pub.sdy.bancoDigital.bancos.Banco;
import pub.sdy.bancoDigital.clientes.Cliente;
import pub.sdy.bancoDigital.contas.Conta;
import pub.sdy.bancoDigital.contas.ContaCorrente;
import pub.sdy.bancoDigital.contas.ContaPoupanca;

public class Main {

	public static void main(String[] args) {

		//Cria banco
		Banco NuBank = new Banco("NuBank");
		
		//Cria cliente
		Cliente Lucas = new Cliente("Lucas", "09146608028");
		
		//Cria Contas
		Conta cc = new ContaCorrente(Lucas);
		Conta cp = new ContaPoupanca(Lucas);
		
		//Adicionar contas ao cliente
		Lucas.addContaCliente(cc);
		Lucas.addContaCliente(cp);
		
		//Adicionar cliente ao banco
		NuBank.adicionarCliente(Lucas);
		
		NuBank.listarClientes();
		System.out.println();
		
		//Movimentacoes contas Cliente:
		cc.depositar(1000);
		cc.transferir(cp, 600);
		cp.saca(200);
		System.out.println();
		
		Lucas.imprimeListaContasCliente();

		
	}

}
