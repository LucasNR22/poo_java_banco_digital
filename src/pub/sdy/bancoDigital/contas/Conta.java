package pub.sdy.bancoDigital.contas;

import pub.sdy.bancoDigital.clientes.Cliente;

public abstract class Conta {
	
	private static final int AGENCIA_UNICA = 1;
	private static int SEQ_AGENCIA = 1;
	
	protected int agencia;
	protected int numConta;
	protected double saldo;
	protected Cliente proprietario;
		
	//Construtor conta:
	public Conta(Cliente proprietario) {
		this.agencia = Conta.AGENCIA_UNICA;
		this.numConta = SEQ_AGENCIA++;
		this.proprietario = proprietario;
	}
	
	public void saca(double valor) {
		System.out.printf("Sacando %.2f da conta %d do cliente %s", valor, getNumConta(), proprietario.getNomeCliente());
		System.out.println();
		this.saldo = this.saldo - valor;
	}
	public void depositar(double valor) {
		System.out.printf("Depositando %.2f da conta %d do cliente %s", valor, getNumConta(), proprietario.getNomeCliente());
		System.out.println();
		this.saldo = this.saldo + valor;
	}
	public void transferir(Conta contaDestino, double valor) {
		System.out.printf("Transfenrindo %.2f da conta %d para conta %d do cliente %s ", valor, getNumConta(), contaDestino.getNumConta(), proprietario.getNomeCliente());
		System.out.println();
		this.saldo = this.saldo - valor;
		contaDestino.setSaldo(contaDestino.getSaldo()+valor);
	}

	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Cliente getProprietario() {
		return proprietario;
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumConta() {
		return numConta;
	}

	public double getSaldo() {
		return saldo;
	}

	
}
