package pub.sdy.bancoDigital.bancos;
import java.util.ArrayList;
import java.util.List;
import pub.sdy.bancoDigital.clientes.Cliente;

public class Banco {
	
	private String nomeBanco;
	private int codigoBanco;
	private List<Cliente> listaClientes;
	
	private static int SEQ_BANCO = 1;

	
	//Construtor banco
	public Banco(String nomeBanco) {
		this.nomeBanco = nomeBanco;
		this.codigoBanco = SEQ_BANCO++;
		this.listaClientes = new ArrayList<Cliente>();
	}
	
	//Metodos
	public void adicionarCliente(Cliente novoCliente) {
		listaClientes.add(novoCliente);
	}
	
	public void removerCliente(Cliente clienteRemover) {
		listaClientes.remove(clienteRemover);
	}

	public String getNomeBanco() {
		return nomeBanco;
	}

	public int getCodigoBanco() {
		return codigoBanco;
	}

	public List<Cliente> getListaCliente() {
		return listaClientes;
	}
	
	public void listarClientes() {
		System.out.println("Esta eh a lista de clientes e suas contas do banco "+getCodigoBanco()+"-"+getNomeBanco());
		for (Cliente cliente : listaClientes) {
			System.out.println(cliente.getCodCliente() +"-"+ cliente.getNomeCliente() + ": " + cliente.getListaContasCliente().size() + " contas");
		}
	}
	
}
