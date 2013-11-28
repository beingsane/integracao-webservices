package br.com.ecodetech.integracao.client.test;

import java.util.List;

import br.com.ecodetech.integracao.client.Cliente;
import br.com.ecodetech.integracao.client.Produto;
import br.com.ecodetech.integracao.client.Servicos;
import br.com.ecodetech.integracao.client.ServicosService;

public class WSClient {
	public static void main(String[] args) {
		Servicos servicos = new ServicosService().getServicosPort();
		System.out.println(servicos.getMensagem("momo"));
		System.out.println("======================");
		
		Cliente cliente = servicos.getCliente(2l);
		System.out.println("Retornado: " + cliente.getId() + " - "
				+ cliente.getNome() + " [" + cliente.getEmail() + "]");
		System.out.println("======================");
		
		List<Cliente> lista = servicos.getListaCliente();
		for (Cliente c : lista) {
			System.out.println(c.getId() + " - " + c.getNome() + " ["
					+ c.getEmail() + "]");
		}
		System.out.println("======================");
		
		List<Produto> listaProduto = servicos.getListaProduto();
		for (Produto p : listaProduto) {
			System.out.println(p.getNome()+" - "+p.getCategoria().getNome());
		}
		
		System.out.println("\n=========== CLIENTES ===========");
		String xml = servicos.getListaClienteXML();
		System.out.println(xml);

		System.out.println("\n=========== PRODUTOS ===========");
		xml = servicos.getListaProdutoXML();
		System.out.println(xml);
	}
}
