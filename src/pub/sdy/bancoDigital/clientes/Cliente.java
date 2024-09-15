package pub.sdy.bancoDigital.clientes;

import java.util.ArrayList;
import java.util.List;

import pub.sdy.bancoDigital.contas.*;

public class Cliente {
	
	private String nomeCliente;
	private String cpfCliente;
	private List<Conta> listaContasCliente;
	private int codCliente;

	private static int SEQ_CLIENTE = 1;
	
	public Cliente(String nomeNovoCliente, String cpfNovoCliente) {
		this.nomeCliente = nomeNovoCliente;
		this.cpfCliente = cpfNovoCliente;
		listaContasCliente = new ArrayList<Conta>();
		this.codCliente = SEQ_CLIENTE++;
	}


	public String getNomeCliente() {
		return nomeCliente;
	}

	public String getCpfCliente() {
		return cpfCliente;
	}

	public List<Conta> getListaContasCliente() {
		return listaContasCliente;
	}

	public int getCodCliente() {
		return codCliente;
	}
	
	public void addContaCliente(Conta novaContaCliente) {
		listaContasCliente.add(novaContaCliente);
	}
	
	public void imprimeListaContasCliente() {
		System.out.println("Aqui estao as contas do cliente "+ getNomeCliente());
		for (Conta conta : listaContasCliente) {
			if (conta instanceof ContaCorrente) {
				((ContaCorrente) conta).imprimirExtrato();
			} else if (conta instanceof ContaPoupanca) {
				((ContaPoupanca) conta).imprimirExtrato();
			}
		}
	}
	
}
